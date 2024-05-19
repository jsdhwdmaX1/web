package com.crushfirefly.service.impl;

import com.crushfirefly.mapper.UserMapper;
import com.crushfirefly.pojo.User;
import com.crushfirefly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        if(userMapper.getUserByUsername(user) == null){
            userMapper.insertUser(user);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public User login(User user) {
        return userMapper.getUserByUsernameAndPassword(user);
    }
}
