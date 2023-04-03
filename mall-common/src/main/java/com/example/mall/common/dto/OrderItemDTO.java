package com.example.mall.common.dto;

import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单明细信息DTO
 */
@Data
public class OrderItemDTO extends BaseBean {

    /** 订单明细ID **/
    private Long id;

    /** 订单号 **/
    private Long orderNo;

    /** 商品ID **/
    private Long goodsId;

    /** 数量 **/
    private Long number;

    /** 金额 **/
    private BigDecimal amount;

    public OrderItemDTO() {
    }

    private OrderItemDTO(Builder builder) {
        this.id = builder.id;
        this.orderNo = builder.orderNo;
        this.goodsId = builder.goodsId;
        this.number = builder.number;
        this.amount = builder.amount;
    }

    public static class Builder {
        private Long id;
        private Long orderNo;
        private Long goodsId;
        private Long number;
        private BigDecimal amount;

        public Builder() {
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder orderNo(Long orderNo) {
            this.orderNo = orderNo;
            return this;
        }

        public Builder goodsId(Long goodsId) {
            this.goodsId = goodsId;
            return this;
        }

        public Builder number(Long number) {
            this.number = number;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public OrderItemDTO build() {
            return new OrderItemDTO(this);
        }
    }
}
