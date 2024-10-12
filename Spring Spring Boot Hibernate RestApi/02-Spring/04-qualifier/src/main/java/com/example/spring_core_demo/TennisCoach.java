package com.example.spring_core_demo.commons;

import com.example.spring_core_demo.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "this is tennis coach";
    }
}
