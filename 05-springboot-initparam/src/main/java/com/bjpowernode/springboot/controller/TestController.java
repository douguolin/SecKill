package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Value("${bjpowernode.name}")
    private String name;
    @Value("${bjpowernode.age}")
    private Integer age;

    @Autowired
    private User user;

    @RequestMapping("/boot/test")
    public @ResponseBody String test(){


        return "user="+user.toString();


    }

}
