package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootbalCoach implements FootballCoach {
    public String getDailyWorkout() {
        return "Playing football currently !!";
    }
}
