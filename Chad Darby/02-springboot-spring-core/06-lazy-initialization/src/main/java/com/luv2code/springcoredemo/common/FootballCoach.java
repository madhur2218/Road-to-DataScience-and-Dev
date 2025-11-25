package com.luv2code.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    FootballCoach() {
        System.out.println("FootballCoach constructor called : "+ getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is football coach !!";
    }
}
