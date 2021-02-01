package com.anand.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloApi {

    @GetMapping
    public String hello() {
        return "Hello " + new Date();
    }
}
