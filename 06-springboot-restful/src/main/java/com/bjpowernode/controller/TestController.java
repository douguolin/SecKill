package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {



    /*
    @RequestMapping("/boot/restful/{name}/{age}")
    public @ResponseBody String test(@PathVariable("name") String name, @PathVariable("age") Integer age){

        return "name=" + name + "age=" + age;
    }*/

    @RequestMapping("/boot/restful")
    public @ResponseBody String test(){

        return "name=" ;
    }
}
