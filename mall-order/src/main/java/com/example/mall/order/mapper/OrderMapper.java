package com.example.mall.order.mapper;


import com.example.mall.order.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    /**
     * 新增订单
     *
     * @param orderDO
     * @return
     */
    int insertOrder(OrderDO orderDO);

}
