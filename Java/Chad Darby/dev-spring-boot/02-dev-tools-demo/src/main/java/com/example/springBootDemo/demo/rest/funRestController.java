package com.example.springBootDemo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    // expose "/" that returns "Hello World" - end Point

    @GetMapping("/")
    public String sayHello(){
        return "helloWorld123";

    }

    //expose new end point for workout
    @GetMapping("/workout")
    public String workout()
    {
        return "i am working out now";

    }

    @GetMapping("/fortune")
    public String fortune()
    {
        return "good day for fortune";
    }


}
