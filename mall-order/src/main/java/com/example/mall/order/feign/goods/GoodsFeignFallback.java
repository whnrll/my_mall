package com.example.mall.order.feign.goods;


import com.example.mall.common.base.BaseResponse;
import com.example.mall.common.base.ResponseEnum;
import com.example.mall.common.dto.OrderItemDTO;
import com.example.mall.common.exception.BusinessException;

import java.util.List;

public class GoodsFeignFallback implements GoodsFeign {

    @Override
    public BaseResponse checkAndDecreaseStock(List<OrderItemDTO> orderItemDTOList) {
        throw new BusinessException(ResponseEnum.FEIGN_CALL_EXCEPTION);
    }
}
