package com.project.bolg.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserQuery extends PageInfo{
    @ApiModelProperty("用户名")
    private String username;
}
