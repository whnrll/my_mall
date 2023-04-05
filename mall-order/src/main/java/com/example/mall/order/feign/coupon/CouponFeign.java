package com.example.mall.order.feign.coupon;


import com.example.mall.common.base.BaseResponse;
import com.example.mall.common.dto.CouponRecordDTO;
import com.example.mall.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(
    name = "mall-coupon",
    fallback = CouponFeignFallback.class,
    configuration = FeignConfig.class
)
public interface CouponFeign {

    @PostMapping("/couponRecord")
    BaseResponse receiveCoupon(@RequestBody CouponRecordDTO couponRecordDTO);

    @PutMapping("/couponRecord")
    BaseResponse useCoupon(@RequestBody CouponRecordDTO couponRecordDTO);

}
