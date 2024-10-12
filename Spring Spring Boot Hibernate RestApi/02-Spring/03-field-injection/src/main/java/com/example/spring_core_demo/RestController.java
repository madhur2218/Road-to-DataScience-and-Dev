package com.example.spring_core_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private CricketCoach myCoach;
    @Autowired
    private Restraunt myRestraunt;

    @GetMapping("/")
    public String cricketCoach(){
        return myCoach.getcricketCoach();
    }
    @GetMapping("/restraunt")
    public String atRestraunt(){
        return myRestraunt.restrauntName();
    }
    @GetMapping("/type")
    public String type(){
        return myRestraunt.restrauntType();
    }

}
