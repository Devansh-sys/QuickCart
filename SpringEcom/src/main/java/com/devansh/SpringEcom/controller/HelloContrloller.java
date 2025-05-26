package com.devansh.SpringEcom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContrloller {
    @GetMapping("/hello")
    public String hello(){
        return "welcome to devansh website";
    }
}
