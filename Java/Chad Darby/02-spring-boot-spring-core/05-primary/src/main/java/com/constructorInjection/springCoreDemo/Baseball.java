package com.constructorInjection.springCoreDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Baseball implements Coach {

    Baseball(){
        System.out.println("In constructor : " +getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Play baseball for 20 minutes everyday";
    }
}
