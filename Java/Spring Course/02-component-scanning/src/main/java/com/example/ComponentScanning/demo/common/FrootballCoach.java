package com.example.ComponentScanning.demo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("footballCoach")
public class FrootballCoach implements  Coach{
    @Override
    public String getdailyWorkout() {
        return "practice daily workout for football";
    }
}
