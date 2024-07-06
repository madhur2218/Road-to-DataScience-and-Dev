package com.constructorInjection.springCoreDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Football implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play football everyday for about 20 minutes";
    }
}
