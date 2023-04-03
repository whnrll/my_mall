package com.example.mall.order.model;


import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderDO extends BaseBean {

    private Long id;

    private Long orderNo;

    private BigDecimal amount;

    private Integer status;

    private Long userId;

    private Long couponRecordId;

    private Date createTime;

    private Date updateTime;
}
