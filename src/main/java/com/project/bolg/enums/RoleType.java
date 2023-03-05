package com.project.bolg.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum RoleType {
    ROLE_ADMIN( "ROLE_ADMIN"),
    ROLE_USER( "ROLE_USER");

    @EnumValue
    private String name;


    RoleType(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
