package com.example.oauth2.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demoresource")
public class DemoResourcesService {

    @RequestMapping(value = "/hello")
    public String getHello() {
        return "Hello World";
    }
}
