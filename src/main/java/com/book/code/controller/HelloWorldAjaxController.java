package com.book.code.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class HelloWorldAjaxController
{
    @RequestMapping("/hello")
    public String say(){
        return "{'messagel':'Springboot 你好'，'message2','你好Ajax'}";
    }

}
