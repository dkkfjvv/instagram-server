package com.example.instagram_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramController {

    @GetMapping("/")
    public String hello() {
        return "whatthe Hello world";
    }

}
