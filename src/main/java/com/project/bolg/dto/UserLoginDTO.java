package com.project.bolg.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserLoginDTO {
    @NotBlank(message="用户名不能为空")
    @ApiModelProperty("用户名")
    private String username;

    @NotBlank(message="密码不能为空")
    @ApiModelProperty("密码")
    private String password;
}
