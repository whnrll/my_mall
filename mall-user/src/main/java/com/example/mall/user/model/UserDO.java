package com.example.mall.user.model;



import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.util.Date;

@Data
public class UserDO extends BaseBean {

    private Long id;

    private String account;

    private String password;

    private String name;

    private Integer role;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}
