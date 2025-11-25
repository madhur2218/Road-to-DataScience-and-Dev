package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Lazy
@Component
public class CricketCoach implements Coach {

    CricketCoach() {
        System.out.println("CricketCoach constructor called : "+ getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is cricket coach, practice fast bowling for 12 minutes !!";
    }
}
