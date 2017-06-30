package com.zpz.service.system.impl;


import com.zpz.mapper.system.UserMapper;
import com.zpz.model.system.User;
import com.zpz.service.system.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 *
 */
@Service
public class UserServiceImpl implements UserService {
   @Resource
    private UserMapper userMapper;

    public User findUser(User user) {
        return userMapper.selectUser(user);
    }
}
