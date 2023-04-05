package com.example.mall.coupon.service.impl;


import com.example.mall.common.dto.CouponDTO;
import com.example.mall.common.util.Assert;
import com.example.mall.common.util.ObjectTransformer;
import com.example.mall.coupon.mapper.CouponMapper;
import com.example.mall.coupon.model.CouponDO;
import com.example.mall.coupon.service.ICouponService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CouponServiceImpl implements ICouponService {

    @Resource
    CouponMapper couponMapper;

    @Override
    public boolean createCoupon(CouponDTO couponDTO) {
        CouponDO couponDO = ObjectTransformer.transform(couponDTO, CouponDO.class);
        int result = couponMapper.insertCoupon(couponDO);
        return Assert.singleRowAffected(result);
    }

}
