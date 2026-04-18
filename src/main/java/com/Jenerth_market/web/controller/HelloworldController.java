package com.Jenerth_market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")

public class HelloworldController {
    @GetMapping("hello")
    public String Hello(){
     return "Hello World";
    }
}
