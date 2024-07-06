package com.constructorInjection.springCoreDemo;

import org.springframework.stereotype.Component;
@Component
public class Cricket implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes !" ;
    }
}
