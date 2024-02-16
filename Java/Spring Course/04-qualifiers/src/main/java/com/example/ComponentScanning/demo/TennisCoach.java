package com.example.ComponentScanning.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
    @Override
    public String dailyWorkout() {
        return "practice daily workout for tennis";
    }
}
