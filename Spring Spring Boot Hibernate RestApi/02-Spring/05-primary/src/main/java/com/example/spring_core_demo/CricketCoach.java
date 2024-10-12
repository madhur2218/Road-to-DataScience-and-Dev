package com.example.spring_core_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "this is cricket coach";
    }


}
