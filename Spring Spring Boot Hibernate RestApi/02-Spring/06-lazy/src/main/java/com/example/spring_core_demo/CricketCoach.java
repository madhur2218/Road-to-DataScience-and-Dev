package com.example.spring_core_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    CricketCoach(){
        System.out.println("In constructor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "this is cricket coach";
    }


}
