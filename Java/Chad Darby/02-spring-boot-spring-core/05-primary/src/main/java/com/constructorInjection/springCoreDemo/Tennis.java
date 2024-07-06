package com.constructorInjection.springCoreDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Tennis implements Coach{

    Tennis(){
        System.out.println("In constructor : " +getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Play tennis daily for about 20 minutes everyday";
    }
}
