package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        System.out.println("hello world ... !!! ");
        return "OK >>> !!! Success, AND I Can change something! ";
    }
}
