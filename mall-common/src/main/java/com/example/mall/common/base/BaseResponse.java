package com.example.mall.common.base;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 响应对象
 *
 * @param <T>
 */
@Data
public class BaseResponse<T> extends BaseBean {

    private String code;
    private String message;
    private T data;

    private static final String EMPTY_STRING = StringUtils.EMPTY;

    public BaseResponse() {
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }

    /**
     * 返回成功响应，带数据体
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data) {
        BaseResponse<T> response = new BaseResponse<T>(ResponseEnum.SUCCESS);
        response.setData(data);
        return response;
    }

    /**
     * 返回成功响应
     *
     * @return
     */
    public static BaseResponse success() {
        return success(EMPTY_STRING);
    }

    /**
     * 返回失败响应
     *
     * @return
     */
    public static BaseResponse error() {
        return new BaseResponse(ResponseEnum.ERROR);
    }

}
