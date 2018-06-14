package com.spring.boot.springBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello world2!";
    }

    @RequestMapping("/")
    public String index(){
        return "welcome!";
    }

}
