package com.example.mall.user.mapper;

import com.example.mall.user.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户Mapper
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户ID查询用户信息
     *
     * @param id
     * @return
     */
    UserDO selectUserById(Long id);

    /**
     * 更新用户信息
     * 
     * @param userInfo
     * @return
     */
    int updateUser(UserDO userInfo);
}
