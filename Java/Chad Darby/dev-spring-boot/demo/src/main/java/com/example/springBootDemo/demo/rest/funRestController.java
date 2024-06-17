package com.example.springBootDemo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    // expose "/" that returns "Hello World" - end Point

    @GetMapping("/123")
    public String sayHello(){
        return "helloWorld123";

    }


}
