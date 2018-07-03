package com.spring.boot.springBootDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
public class HelloController {

    @Value("hello you!")
    private String message = "Hello World";

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
