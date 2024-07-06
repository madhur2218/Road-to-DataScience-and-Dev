package com.constructorInjection.springCoreDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Football implements Coach{

    Football(){
        System.out.println("In constructor : " +getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Play football everyday for about 20 minutes";
    }
}
