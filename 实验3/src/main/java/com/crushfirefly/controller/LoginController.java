package com.crushfirefly.controller;

import com.crushfirefly.pojo.Result;
import com.crushfirefly.pojo.User;
import com.crushfirefly.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        User u =userService.login(user);
        return u != null ? Result.success() : Result.error("用户名或密码错误") ;
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        return userService.addUser(user) ? Result.success() : Result.error("用户名重复");
    }

}
