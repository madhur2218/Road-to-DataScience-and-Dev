package com.example.demospringcore;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    public String getdailyWorkout(){
        return "play football for 20 min";
    }

}
