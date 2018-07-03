package com.spring.boot.springBootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HomeController {
    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());

        return "welcome";
    }
}
