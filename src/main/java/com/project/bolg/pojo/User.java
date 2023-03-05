package com.project.bolg.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@Getter
@Setter
@TableName("user")
@ApiModel(value = "User对象", description = "用户信息表")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @NotBlank(message="用户名不能为空")
    @Length(min = 6, max = 50, message = "用户名长度在[6,50]之间")
    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @NotBlank(message="密码不能为空")
    @Length(min = 8, max = 100, message = "密码长度在[8,100]之间")
    @ApiModelProperty("密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("座右铭")
    @TableField("motto")
    private String motto;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("电话")
    @TableField("mobile")
    private String mobile;

    @ApiModelProperty("地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("头像")
    @TableField("avatar_url")
    private String avatarUrl;

    @ApiModelProperty("角色类型")
    @TableField("role_type")
    private String roleType;

    @ApiModelProperty("文章总浏览量")
    @TableField("views")
    private Integer views;

    @ApiModelProperty("加盐")
    @TableField("salt")
    private String salt;


}

