package com.example.mall.user;

import com.example.mall.user.mapper.UserMapper;
import com.example.mall.user.model.UserDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperTest extends BaseSpringTest{
    @Autowired
    private UserMapper userMapper;

    @Test
    public void t1() {
        UserDO userDO = userMapper.selectUserById(1L);
        System.out.println(userDO);

    }
}
