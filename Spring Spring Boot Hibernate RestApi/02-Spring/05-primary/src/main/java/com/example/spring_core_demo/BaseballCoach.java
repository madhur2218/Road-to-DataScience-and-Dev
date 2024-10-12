package com.example.spring_core_demo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "this is baseball coach";
    }
}
