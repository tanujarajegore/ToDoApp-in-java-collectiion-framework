package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Security!";
    }
    @GetMapping("/user")
    public String user() {
        return "User Page";
    }
    @GetMapping("/admin")
    public String admin() {
        return "Admin Page";
    }
    @GetMapping("/manager")
    public String manager() {
        return "Manager Page";
    }
}