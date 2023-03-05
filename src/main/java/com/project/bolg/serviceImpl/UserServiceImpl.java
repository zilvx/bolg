package com.project.bolg.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.bolg.mapper.UserMapper;
import com.project.bolg.pojo.User;
import com.project.bolg.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
