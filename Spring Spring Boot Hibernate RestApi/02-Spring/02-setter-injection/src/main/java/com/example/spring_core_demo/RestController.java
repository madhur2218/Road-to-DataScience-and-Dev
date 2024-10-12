package com.example.spring_core_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private CricketCoach myCoach;
    private Restraunt myRestraunt;

    @Autowired//setter injection for MyRestraunt
    private void setRestraunt(Restraunt myRestraunt){
        this.myRestraunt=myRestraunt;
    }

    @Autowired //setter injection for CricketCoach
    private void setCricketCoach(CricketCoach myCoach){
        this.myCoach=myCoach;
    }

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
