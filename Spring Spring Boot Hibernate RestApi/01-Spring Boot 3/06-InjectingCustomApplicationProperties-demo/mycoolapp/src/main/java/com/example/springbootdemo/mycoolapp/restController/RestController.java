package com.example.springbootdemo.mycoolapp.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    //inject properties for coach and team name
    @Value("${coach.name}")
    private String coachName; //takes value from application.properties file

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String teamInfo(){
        return coachName+" "+teamName;
    }

    @GetMapping("/sum")
    public int sum(){
        return 2+4;
    }

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
