package com.example.spring_core_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private Coach myCoach;

    @Autowired
    public RestController(@Qualifier("footballCoach") Coach myCoach){
        this.myCoach = myCoach; // Use 'this' to assign the parameter to the field
    }

    @GetMapping("/")
    public String coach(){
        return myCoach.getDailyWorkout();
    }
}
