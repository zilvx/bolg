package com.project.bolg.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum StatusType {

    No(0, "禁用"),
    YES(1, "启用");

    /**
     * 数据库里存的值
     */
    @EnumValue
    private int key;

    /**
     * 前端显示的值
     */
    @JsonValue
    private String name;


    StatusType(int key, String name) {
        this.key = key;
        this.name = name;
    }
}
