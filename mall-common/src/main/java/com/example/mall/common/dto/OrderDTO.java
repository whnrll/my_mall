package com.example.mall.common.dto;

import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单信息DTO
 */
@Data
public class OrderDTO extends BaseBean {

    /** 订单号 **/
    private Long orderNo;

    /** 订单金额 **/
    private BigDecimal amount;

    /** 订单状态 0-初始化 1-提交 2-完成 3-撤销 **/
    private Integer status;

    /** 用户ID **/
    private Long userId;

    /** 优惠券ID **/
    private Long couponRecordId;

    /** 订单明细列表 **/
    private List<OrderItemDTO> orderItemDTOList;

    public OrderDTO() { }

    private OrderDTO(Builder builder) {
        this.orderNo = builder.orderNo;
        this.amount = builder.amount;
        this.status = builder.status;
        this.userId = builder.userId;
        this.couponRecordId = builder.couponRecordId;
        this.orderItemDTOList = builder.orderItemDTOList;
    }

    public static class Builder {
        private Long orderNo;
        private BigDecimal amount;
        private Integer status;
        private Long userId;
        private Long couponRecordId;
        private List<OrderItemDTO> orderItemDTOList;

        public Builder orderNo(Long orderNo){
            this.orderNo = orderNo;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder couponRecordId(Long couponRecordId){
            this.couponRecordId = couponRecordId;
            return this;
        }

        public Builder orderItemDTOList(List<OrderItemDTO> orderItemDTOList) {
            this.orderItemDTOList = orderItemDTOList;
            return this;
        }

        public OrderDTO build() {
            return new OrderDTO(this);
        }
    }
}
