package com.project.bolg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.bolg.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}


