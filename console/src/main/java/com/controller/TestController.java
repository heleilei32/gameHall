package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test")
    public void test1(){
        System.out.printf("进入ctrl");
    }
    @RequestMapping("/login")
    public String login(){
        System.out.printf("login");
        return "index";
    }
}
