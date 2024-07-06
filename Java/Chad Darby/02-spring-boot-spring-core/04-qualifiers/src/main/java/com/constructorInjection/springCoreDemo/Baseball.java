package com.constructorInjection.springCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class Baseball implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Play baseball for 20 minutes everyday";
    }
}
