package com.crushfirefly.service;

import com.crushfirefly.pojo.User;

public interface UserService {
    User login(User user);

    boolean addUser(User user);
}
