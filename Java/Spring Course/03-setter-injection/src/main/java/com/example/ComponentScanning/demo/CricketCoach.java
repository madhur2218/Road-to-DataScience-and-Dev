package com.example.ComponentScanning.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {
    @Override
    public String getdailyWorkout() {
        return "practice daily workout for cricket";
    }
}
