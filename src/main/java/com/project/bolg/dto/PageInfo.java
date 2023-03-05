package com.project.bolg.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class PageInfo {
    @ApiModelProperty("页码号")
    private int pageNum;

    @ApiModelProperty("每页大小")
    private int pageSize;
}
