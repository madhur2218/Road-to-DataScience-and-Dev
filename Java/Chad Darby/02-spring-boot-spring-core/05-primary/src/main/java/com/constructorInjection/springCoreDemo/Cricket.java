package com.constructorInjection.springCoreDemo;

import org.springframework.stereotype.Component;
@Component
public class Cricket implements Coach {

    Cricket(){
        System.out.println("In constructor : " +getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes !" ;
    }
}
