package com.book.code.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //返回默认结果为字符串
public class HelloWorldController {

    @Value("${helloWorld}")  //注入属性值
    private String hello;

    @Value("${mysql.jdbcName}")
    private String jdbcName;

    @Value("${mysql.dbUrl}")
    private String dbUrl;

    @Value("${mysql.userName}")
    private String userName;

    @Value("${mysql.password}")
    private String password;

    @RequestMapping("/hello") //映射信息，往往是URL的组成部分
    public String hello() {
        return "mysql.jdbcName:"+jdbcName+"<br/>"
                +"mysql.dbUrl:"+dbUrl+"<br/>"
                +"mysql.userName:"+userName+"<br/>"
                +"mysql.password:"+password+"</br>";

    }
}

