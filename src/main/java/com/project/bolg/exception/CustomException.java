package com.project.bolg.exception;

import lombok.Data;

@Data
public class CustomException extends RuntimeException{
    private Integer code;

    public CustomException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public CustomException(String msg) {
        super(msg);
    }


}
