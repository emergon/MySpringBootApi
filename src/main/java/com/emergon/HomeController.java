package com.emergon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "Welcome to Spring Boot WEB";
    }
}
