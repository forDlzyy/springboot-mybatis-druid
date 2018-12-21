package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.domain.Do.User;
import com.example.mybatisdemo.domain.common.Result;
import com.example.mybatisdemo.service.UserService;
import com.example.mybatisdemo.util.SHA256Util;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    public Result addUser(){
        User user = new User();
        user.setGender(1);
        user.setUserName("小鹿");
        user.setPassword(SHA256Util.getSHA256StrJava("123456"));
        return userService.addUser(user);
    }

}
