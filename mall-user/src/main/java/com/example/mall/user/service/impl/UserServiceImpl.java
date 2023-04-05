package com.example.mall.user.service.impl;


import com.example.mall.common.dto.UserDTO;
import com.example.mall.common.util.Assert;
import com.example.mall.common.util.ObjectTransformer;
import com.example.mall.user.mapper.UserMapper;
import com.example.mall.user.model.UserDO;
import com.example.mall.user.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    UserMapper userMapper;

    @Override
    public UserDTO getUser(Long id) {
        UserDO userDO = userMapper.selectUserById(id);
        Assert.notNull(userDO);
        return ObjectTransformer.transform(userDO, UserDTO.class);
    }

    @Override
    public boolean updateUser(UserDTO userDTO) {
        UserDO userDO = ObjectTransformer.transform(userDTO, UserDO.class);
        int result = userMapper.updateUser(userDO);
        return Assert.singleRowAffected(result);
    }
}
