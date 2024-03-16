package com.dw.test.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class LoginController {


    @RequestMapping("/login")
    public String login(){
        log.info("开始登录了。。。。。。。。。。。。。。");
        return "登錄成功";
    }
}
