package com.example.spring_core_demo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    FootballCoach(){
        System.out.println("In constructor "+getClass().getSimpleName());

    }    @Override
    public String getDailyWorkout() {
        return "this is baseball coach";
    }
}
