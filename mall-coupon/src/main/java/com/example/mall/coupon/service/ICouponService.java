package com.example.mall.coupon.service;


import com.example.mall.common.dto.CouponDTO;

/**
 * 优惠券Service
 */
public interface ICouponService {

    /**
     * 创建优惠券
     *
     * @param couponDTO
     * @return
     */
    boolean createCoupon(CouponDTO couponDTO);

}
