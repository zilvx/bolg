package com.project.bolg.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.project.bolg.common.Result;
import com.project.bolg.dto.UserLoginDTO;
import com.project.bolg.dto.UserQuery;
import com.project.bolg.pojo.User;
import com.project.bolg.service.UserService;
import com.project.bolg.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    private LambdaQueryWrapper<User> wrapper;

    @GetMapping("/list")
    public List<User> getAllUser() {
        List<User> list = userService.list();
        return list;
    }

    // 分页查询
    @PostMapping("/page")
    public Result findPage(@RequestBody UserQuery userQuery) {
        // 查处的数据降序，并且支持模糊查询
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.orderByDesc(User::getId);

        if (!"".equals(userQuery.getUsername()) && userQuery.getUsername() != null) {
            wrapper.like(User::getUsername, userQuery.getUsername());
        }

        Page<User> page = userService.page(
                new Page<>(
                        userQuery.getPageNum(),
                        userQuery.getPageSize()
                ),
                wrapper
        );
        return Result.success(page);
    }


    // 更新 新增(底层是通过id来判断是否是更新操作还是新增操作)
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        userService.saveOrUpdate(user);
        return Result.success();
    }


    // 删除
    @PostMapping("/delBatch")
    public Result delBatch(@RequestBody List<Integer> ids) {
        userService.removeByIds(ids);
        return Result.success();
    }

    @PostMapping("/login")
    public Result login(@Validated @RequestBody UserLoginDTO userLoginDTO) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, userLoginDTO.getUsername())
                .eq(User::getPassword, userLoginDTO.getPassword())
                .last("limit 1");
        User userInfo = userService.getOne(wrapper);

        Map<String, String> map = new HashMap<>();

        if (userInfo != null) {
            String token = JwtUtils.generateToken(userInfo);
            map.put("token", token);
            map.put("username", userInfo.getUsername());
            map.put("email", userInfo.getEmail());
            map.put("roleType", userInfo.getRoleType());
        } else {
            return Result.error("请检查用户密码是否正确");
        }

        return Result.success(map);
    }







}
