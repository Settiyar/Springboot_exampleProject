package com.practice.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class startcontroller {
    @RequestMapping("/")
    @ResponseBody
    public String handle() {
        System.out.println("This is my home page");
        return "Home";
    }

    @RequestMapping("/contact")
    public String contact() {
        System.out.println("contact page");
        return "contact";
    }

}
