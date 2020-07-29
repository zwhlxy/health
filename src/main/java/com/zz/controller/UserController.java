package com.zz.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zwh
 * @Date 2020/7/7 10:37
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private User user;

    @RequestMapping("/user")
    public User user(User users){
        System.out.println(user);
        return user;
    }
}
