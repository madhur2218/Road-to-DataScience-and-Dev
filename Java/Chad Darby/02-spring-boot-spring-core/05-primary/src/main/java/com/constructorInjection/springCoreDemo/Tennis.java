package com.constructorInjection.springCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class Tennis implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play tennis daily for about 20 minutes everyday";
    }
}
