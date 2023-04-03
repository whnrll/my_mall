package com.example.mall.common.exception;


import com.example.mall.common.base.ResponseEnum;

/**
 * 业务异常类
 */
public class BusinessException extends RuntimeException {

    private String code;

    private String message;

    private ResponseEnum responseEnum;

    public BusinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException(ResponseEnum responseEnum) {
        super(responseEnum.getMessage());
        this.responseEnum = responseEnum;
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
