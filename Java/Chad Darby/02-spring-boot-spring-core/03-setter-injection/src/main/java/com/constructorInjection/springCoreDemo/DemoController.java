package com.constructorInjection.springCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @Autowired
    private Coach coach;

    // Combined setter for dependency injection
//    @Autowired
//    public void setCoach(Coach coach ){
//        this.coach= coach;
//
//    }

    @GetMapping("/dailyWorkout")  // Used to build a URL
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

}
