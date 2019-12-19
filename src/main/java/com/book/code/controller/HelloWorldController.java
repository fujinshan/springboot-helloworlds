package com.book.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //返回默认结果为字符串
public class HelloWorldController {

    @RequestMapping("/hellop") //映射信息，往往是URL的组成部分
    public String hello(){
        return "Hello World";
    }
}

