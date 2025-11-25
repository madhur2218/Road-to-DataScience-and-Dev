package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


    TennisCoach() {
        System.out.println("TennisCoach constructor called : "+ getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is tennis coach !";
    }
}
