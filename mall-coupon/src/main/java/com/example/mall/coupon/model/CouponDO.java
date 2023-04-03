package com.example.mall.coupon.model;



import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CouponDO extends BaseBean {

    private Long id;

    private String title;

    private BigDecimal withAmount;

    private BigDecimal usedAmount;

    private Long quota;

    private Long takeCount;

    private Long usedCount;

    private Integer status;

    private Date createTime;

    private Date updateTime;

}
