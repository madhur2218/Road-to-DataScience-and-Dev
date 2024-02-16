package com.example.ComponentScanning.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class BaseballCoach implements Coach {
    @Override
    public String dailyWorkout() {
        return "practice daily workout for baseball";
    }
}
