package com.example.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service/")
public class SecondServiceController {
    @GetMapping("/check")
    public String check() {
        return "Hi, there. This is a message from Second Service";
    }
}
