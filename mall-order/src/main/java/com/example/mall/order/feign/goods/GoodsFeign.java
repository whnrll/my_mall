package com.example.mall.order.feign.goods;


import com.example.mall.common.base.BaseResponse;
import com.example.mall.common.dto.OrderItemDTO;
import com.example.mall.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(
    name = "mall-goods",
    fallback = GoodsFeignFallback.class,
    configuration = FeignConfig.class
)
public interface GoodsFeign {

    @PutMapping("/goods/stock")
    BaseResponse checkAndDecreaseStock(@RequestBody List<OrderItemDTO> orderItemDTOList);

}
