package com.example.mall.common.dto;


import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息DTO
 */
@Data
public class GoodsDTO extends BaseBean {

    /** 商品ID **/
    private Long id;

    /** 商品名称 **/
    private String name;

    /** 商品描述 **/
    private String description;

    /** 商品类型 **/
    private Integer type;

    /** 商品价格 **/
    private BigDecimal price;

    /** 商品库存 **/
    private Long stock;

    public GoodsDTO() {
    }

    private GoodsDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.type = builder.type;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    public static class Builder {

        private Long id;
        private String name;
        private String description;
        private Integer type;
        private BigDecimal price;
        private Long stock;

        public Builder() {
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder stock(Long stock) {
            this.stock = stock;
            return this;
        }

        public GoodsDTO build() {
            return new GoodsDTO(this);
        }
    }
}
