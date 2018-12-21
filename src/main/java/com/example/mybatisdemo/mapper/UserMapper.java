package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.domain.Do.User;

public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}