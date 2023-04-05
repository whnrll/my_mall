package com.example.mall.order.service.impl;


import com.example.mall.common.base.BaseResponse;
import com.example.mall.common.dto.CouponRecordDTO;
import com.example.mall.common.dto.OrderDTO;
import com.example.mall.common.dto.OrderItemDTO;
import com.example.mall.common.util.Assert;
import com.example.mall.common.util.ObjectTransformer;
import com.example.mall.order.feign.coupon.CouponFeign;
import com.example.mall.order.feign.goods.GoodsFeign;
import com.example.mall.order.mapper.OrderItemMapper;
import com.example.mall.order.mapper.OrderMapper;
import com.example.mall.order.model.OrderDO;
import com.example.mall.order.model.OrderItemDO;
import com.example.mall.order.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    OrderMapper orderMapper;

    @Resource
    OrderItemMapper orderItemMapper;

    @Resource
    CouponFeign couponFeign;

    @Resource
    GoodsFeign goodsFeign;

    /**
     * 下单服务
     * <p>
     * 1、先判断是否有使用优惠券，有的话则调用优惠券服务，进行优惠券核销处理 <br/>
     * 2、获取订单明细列表，调用商品服务，根据商品ID和购买数量，进行库存检查和扣减 <br/>
     * 3、保存主订单信息 <br/>
     * 4、保存订单明细 <br/>
     * </p>
     *
     * @param orderDTO
     * @return
     */
    @Override
    public boolean createOrder(OrderDTO orderDTO) {

        /** 1、优惠券处理 **/
        if (orderDTO.getCouponRecordId() != null) {
            CouponRecordDTO couponRecordDTO = new CouponRecordDTO.Builder()
                    .id(orderDTO.getCouponRecordId())
                    .userId(orderDTO.getUserId())
                    .build();
            BaseResponse useCouponResponse = couponFeign.useCoupon(couponRecordDTO);
            Assert.successResponse(useCouponResponse);
        }

        /** 2、检查并且扣减库存 **/
        List<OrderItemDTO> orderItemDTOList = orderDTO.getOrderItemDTOList();
        BaseResponse stockResponse = goodsFeign.checkAndDecreaseStock(orderItemDTOList);
        Assert.successResponse(stockResponse);

        /** 3、保存主订单 **/
        OrderDO orderDO = ObjectTransformer.transform(orderDTO, OrderDO.class);
        int result = orderMapper.insertOrder(orderDO);
        Assert.singleRowAffected(result);

        /** 4、保存订单明细 **/
        List<OrderItemDO> orderItemDOList = ObjectTransformer.transform(orderItemDTOList, OrderItemDO.class);
        result = orderItemMapper.insertOrderItems(orderItemDOList);
        Assert.totalRowsAffected(result, orderItemDOList);

        return true;
    }
}
