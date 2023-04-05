package com.example.mall.order.service;


import com.example.mall.common.dto.OrderDTO;

/**
 * 订单服务Service
 */
public interface IOrderService {

    /**
     * 创建订单
     *
     * @param orderDTO
     * @return
     */
    boolean createOrder(OrderDTO orderDTO);

}
