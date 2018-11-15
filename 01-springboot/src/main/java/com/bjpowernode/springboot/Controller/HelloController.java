package com.bjpowernode.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){

        return"HELLO SPRINGBOOT";
    }
}
