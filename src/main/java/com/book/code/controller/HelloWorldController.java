package com.book.code.controller;

import com.book.code.MysqlProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController   //返回默认结果为字符串
public class HelloWorldController {

    @Value("${helloWorld}")  //注入属性值
   private String hello;
//
//    @Value("${mysql.jdbcName}")
//    private String jdbcName;
//
//    @Value("${mysql.dbUrl}")
//    private String dbUrl;
//
//    @Value("${mysql.userName}")
//    private String userName;
//
//    @Value("${mysql.password}")
//    private String password;

    @Resource
    private MysqlProperties mysqlProperties;

    @RequestMapping("/hello") //映射信息，往往是URL的组成部分
    public String hello() {
        return hello;

    }
//    mysql.jdbcName=com.mysql.jdbc.Driver
//    mysql.dbUrl=
//    mysql.userName=root
//    mysql.password=sa
    @RequestMapping("/showJdbc")
    public String showJdbc(){

        mysqlProperties.setJdbcName("com.mysql.jdbc.Driver");

        mysqlProperties.setDbUrl("jdbc:mysql://localhost:3306/mytest");

        mysqlProperties.setUserName("root");

        mysqlProperties.setPassword("sa");

        return "mysql.jdbcName:"+mysqlProperties.getJdbcName()+"<br/>"
                +"mysql.dbUrl:"+mysqlProperties.getDbUrl()+"<br/>"
                +"mysql.userName:"+mysqlProperties.getUserName()+"<br/>"
                +"mysql.password:"+mysqlProperties.getPassword()+"</br>";
    }
}

