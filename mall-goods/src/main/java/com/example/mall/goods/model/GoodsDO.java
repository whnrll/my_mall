package com.example.mall.goods.model;

import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class GoodsDO extends BaseBean {

    private Long id;

    private String name;

    private String description;

    private Integer type;

    private BigDecimal price;

    private Long stock;

    private Date createTime;

    private Date updateTime;
}
