package com.example.mall.order.feign.coupon;


import com.example.mall.common.base.BaseResponse;
import com.example.mall.common.base.ResponseEnum;
import com.example.mall.common.dto.CouponRecordDTO;
import com.example.mall.common.exception.BusinessException;

public class CouponFeignFallback implements CouponFeign {

    @Override
    public BaseResponse receiveCoupon(CouponRecordDTO couponRecordDTO) {
        throw new BusinessException(ResponseEnum.FEIGN_CALL_EXCEPTION);
    }

    @Override
    public BaseResponse useCoupon(CouponRecordDTO couponRecordDTO) {
        throw new BusinessException(ResponseEnum.FEIGN_CALL_EXCEPTION);
    }
}
