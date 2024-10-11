package com.example.springbootdemo.mycoolapp.restController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    //exposing an endpoint which returns hello world
    @GetMapping("/")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Running 5k!";
    }

    @GetMapping("/eating")
    public String geteating(){
        return "eating";
    }

    @GetMapping("/fortunite")
    public String getFortune(){
        return "today is your lucky day";
    }

}
