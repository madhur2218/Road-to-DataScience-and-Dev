package com.example.spring_core_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private CricketCoach myCoach;
    private Restraunt restraunt;

    //Creating restraunt class bean
    @Autowired
    public RestController(Restraunt restraunt){
        this.restraunt=restraunt;
    }

//    //Creating constructor for injection
//    @Autowired
//    public RestController (CricketCoach myCoach){
//        this.myCoach=myCoach;
//
//    }

    @GetMapping("/")
    public String cricketCoach(){
        return myCoach.getcricketCoach();
    }
    @GetMapping("/restraunt")
    public String atRestraunt(){
        return restraunt.restrauntName();
    }
    @GetMapping("/type")
    public String type(){
        return restraunt.restrauntType();
    }

}
