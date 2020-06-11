package com.hp.house.house2.controller;

import com.hp.house.house2.dao.UserMapper;
import com.hp.house.house2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired//依赖注入
    UserMapper userMapper;

    @RequestMapping("findUserByUserName")
    public User FindUserByUserName(){
       User user=  userMapper.selectUserByName("asdasd");
        System.out.println("更新1");
        System.out.println("创建分支");

        return user;
    }

}
