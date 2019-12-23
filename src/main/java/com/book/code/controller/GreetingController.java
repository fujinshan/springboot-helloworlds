package com.book.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller                   //返回的结果为字符串
public class GreetingController {

    @GetMapping("/greeting") //映射信息，且采用的是Get方法获取信息
    @ResponseBody            //修改了@Controller 的返回要求，返回结果是字符串
    public String greeting(){
        System.out.println("Hello");
        return "greeting";
    }

    @GetMapping("/hi")
    public String hi(@RequestParam(name = "name",required = false,defaultValue = "World") String name, Model model)
    {
        model.addAttribute("name",name);
        return "hi"; //返回的是视图，即返回位于templates目录下的hi.html
    }
}
