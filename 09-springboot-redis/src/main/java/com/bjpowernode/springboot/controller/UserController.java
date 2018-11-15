package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;
    
    @RequestMapping("/boot/select")
    public List<User> select(){

        //先去缓存拿，为空再去数据库拿并存到redis
        List<User> userList = (List<User>) redisTemplate.opsForValue().get("userAll");

        if (null == userList) {
           userList = userService.selectAll();
           redisTemplate.opsForValue().set("userAll",userList,15, TimeUnit.MINUTES);
            System.out.println("从数据库中获取数据====");
        }else{
            System.out.println("从redis中获取数据------");
        }
        return userList;
    }
    @Autowired
    private User user;
    @RequestMapping("/boot/insert")
    public void addUser(){
        user.setAge(23);
        user.setName("lisi");
        userService.insertUser();

    }
}
