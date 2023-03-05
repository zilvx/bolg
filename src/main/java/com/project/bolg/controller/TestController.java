package com.project.bolg.controller;

import com.project.bolg.common.Result;
import com.project.bolg.exception.CustomException;
import com.project.bolg.mapper.UserMapper;
import com.project.bolg.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "测试模块", tags = "测试模块")
@RestController // 数据以json形式返回
public class TestController {


    @Value("${text}")
    private String text;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    @ApiOperation(value = "测试", notes = "测试")
    public String test() {
        return "Happy Wealthy!";
    }

    @GetMapping("/text")
    @ApiOperation(value = "获取环境", notes = "获取环境")
    public String getText() {
        return text;
    }

    @GetMapping("/user")
    @ApiOperation(value = "获取用户", notes = "获取用户")
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }

    @GetMapping("/testSuccess")
    @ApiOperation(value = "测试统一返回类：成功")
    public Result testSuccess() {
        return Result.success(userMapper.selectById(1));
    }

    @GetMapping("/testError")
    @ApiOperation(value = "测试统一返回类：失败")
    public Result testError() {
        return Result.error("测试统一返回类：失败");
    }


    @PostMapping("/testException")
    public Result testException() {
        throw new CustomException("这个是自定义异常");
    }


}
