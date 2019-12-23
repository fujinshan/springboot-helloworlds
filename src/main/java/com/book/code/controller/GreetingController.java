package com.book.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                   //返回的结果为字符串
public class GreetingController {

    @GetMapping("/greeting") //映射信息，且采用的是Get方法获取信息
    public String greeting(){
        return "greeting";
    }
}
