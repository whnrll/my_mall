package com.example.mall.common.dto;

import com.example.mall.common.base.BaseBean;
import lombok.Data;

import java.util.Date;

/**
 * 用户信息DTO
 */
@Data
public class UserDTO extends BaseBean {

    /** 用户ID **/
    private Long id;

    /** 用户账号 **/
    private String account;

    /** 用户姓名 **/
    private String name;

    /** 用户密码 **/
    private String password;

    /** 用户角色 1-普通用户 2-讲师 **/
    private Integer role;

    /** 用户状态 0-锁定 1-正常 **/
    private Integer status;

    public UserDTO() {
    }

    private UserDTO(Builder builder) {
        this.id = builder.id;
        this.account = builder.account;
        this.name = builder.name;
        this.password = builder.password;
        this.status = builder.status;
    }

    public static class Builder {

        private Long id;
        private String account;
        private String name;
        private String password;
        private Integer role;
        private Integer status;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder account(String account) {
            this.account = account;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder role(Integer role) {
            this.role = role;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }
    }
}
