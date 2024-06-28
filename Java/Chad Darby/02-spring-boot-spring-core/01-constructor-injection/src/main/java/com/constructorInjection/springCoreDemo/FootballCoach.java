package com.constructorInjection.springCoreDemo;


import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements IFootballCoach{
    @Override
    public String getFootballCoach() {
        return "Practice football for 15 minutes";
    }

}

