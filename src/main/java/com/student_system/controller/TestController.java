package com.student_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 魏国梁 on 2019/10/14.
 */
@Controller
public class TestController {

    @RequestMapping("/login")
    public  void login(){
        System.out.printf("是否能够运行到这里");
    }
}
