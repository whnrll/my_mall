package com.example.mall.order.config;


import com.example.mall.order.feign.coupon.CouponFeignFallback;
import com.example.mall.order.feign.goods.GoodsFeignFallback;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public GoodsFeignFallback goodsFeignFallback() {
        return new GoodsFeignFallback();
    }

    @Bean
    public CouponFeignFallback couponFeignFallback() {
        return new CouponFeignFallback();
    }

}
