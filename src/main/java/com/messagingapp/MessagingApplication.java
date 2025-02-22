package com.messagingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingApplication {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From Bridgelabz";
    }

    @GetMapping("/hello/query")
    public String fetchName(@RequestParam String name){
        return "Hello "+name;
    }
}
