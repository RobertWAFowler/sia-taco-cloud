package com.zenhog.tacocloud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorPageController {

    @RequestMapping("/demo")
    public String SpringBootHello() {
        int i=5/0;          // it will throws exception  ArithmeticException: / by zero
        return "demo";
    }
}
