package com.example.mall.coupon.model;


import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.util.Date;

@Data
public class CouponRecordDO extends BaseBean {

    private Long id;

    private Long userId;

    private Long couponId;

    private Integer status;

    private Date createTime;

    private Date updateTime;

}
