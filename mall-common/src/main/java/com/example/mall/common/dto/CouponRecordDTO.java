package com.example.mall.common.dto;


import com.example.mall.common.base.BaseBean;
import lombok.Data;

/**
 * 优惠券领取和使用记录DTO
 */
@Data
public class CouponRecordDTO extends BaseBean {

    /**
     * 优惠券记录ID
     **/
    private Long id;

    /**
     * 用户ID
     **/
    private Long userId;

    /**
     * 优惠券ID
     **/
    private Long couponId;

    /**
     * 状态 0-已领取未使用 1-已使用 -1为已过期
     **/
    private Integer status;

    public CouponRecordDTO() {
    }

    private CouponRecordDTO(Builder builder) {
        this.id = builder.id;
        this.userId = builder.userId;
        this.couponId = builder.couponId;
        this.status = builder.status;
    }

    public static class Builder {
        private Long id;
        private Long userId;
        private Long couponId;
        private Integer status;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder couponId(Long couponId) {
            this.couponId = couponId;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public CouponRecordDTO build() {
            return new CouponRecordDTO(this);
        }
    }

}
