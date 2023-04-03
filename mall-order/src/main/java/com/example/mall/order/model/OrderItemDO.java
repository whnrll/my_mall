package com.example.mall.order.model;


import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderItemDO extends BaseBean {

    private Long id;

    private Long orderNo;

    private Long goodsId;

    private Long number;

    private BigDecimal amount;

    private Date createTime;

    private Date updateTime;

}
