package com.zpz.service.system.impl;


import com.zpz.mapper.system.UserMapper;
import com.zpz.model.system.User;
import com.zpz.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Administrator on 2017-6-29.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper  userMapper;

    public int saveUserWithBackId(User user) {
        return userMapper.insertUserWithBackId(user);
    }
}
