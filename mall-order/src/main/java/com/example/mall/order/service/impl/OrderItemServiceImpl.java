package com.example.mall.order.service.impl;

import com.example.mall.order.mapper.OrderItemMapper;
import com.example.mall.order.service.IOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class OrderItemServiceImpl implements IOrderItemService {

    @Resource
    OrderItemMapper orderItemMapper;

}
