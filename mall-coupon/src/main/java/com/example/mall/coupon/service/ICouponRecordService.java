package com.example.mall.coupon.service;


import com.example.mall.common.dto.CouponRecordDTO;

/**
 * 优惠券记录Service
 */
public interface ICouponRecordService {

    /**
     * 领取优惠券
     *
     * @param couponRecordDTO
     * @return
     */
    boolean receiveCoupon(CouponRecordDTO couponRecordDTO);

    /**
     * 使用优惠券
     *
     * @param couponRecordDTO
     * @return
     */
    boolean useCoupon(CouponRecordDTO couponRecordDTO);

}
