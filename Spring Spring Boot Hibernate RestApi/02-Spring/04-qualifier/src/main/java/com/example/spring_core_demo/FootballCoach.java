package com.example.spring_core_demo.commons;

import com.example.spring_core_demo.Coach;
import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "this is football coach";
    }
}
