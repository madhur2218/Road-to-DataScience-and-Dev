package com.example.demospringcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{
    @Override
    public String getdailyWorkout() {
        return "practice daily workout for cricket";
    }
}
