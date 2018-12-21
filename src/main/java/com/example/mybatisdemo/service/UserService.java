package com.example.mybatisdemo.service;

import com.example.mybatisdemo.domain.Do.User;
import com.example.mybatisdemo.domain.common.Result;
import com.example.mybatisdemo.domain.common.Status;
import com.example.mybatisdemo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Result addUser(User user) {
        int insert = userMapper.insert(user);
        if (insert != NumberUtils.INTEGER_ZERO){
            return Result.okMsg();
        }
        return Result.fail(Status.ER);
    }
}
