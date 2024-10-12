package com.example.spring_core_demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getcricketCoach(){
        return "Learning cricket!!!";
    }


}
