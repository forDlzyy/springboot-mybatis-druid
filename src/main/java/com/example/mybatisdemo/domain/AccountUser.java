package com.example.mybatisdemo.domain;

import lombok.Data;

@Data
public class AccountUser {

    private Integer id;

    private String user_name;

    private String password;

    private Integer gender;
}
