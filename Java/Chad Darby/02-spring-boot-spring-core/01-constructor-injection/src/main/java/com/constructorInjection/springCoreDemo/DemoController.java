package com.constructorInjection.springCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;
    private final IFootballCoach footballCoach;

    // Combined constructor for dependency injection
    @Autowired
    public DemoController(Coach coach, IFootballCoach footballCoach) {
        this.coach = coach;
        this.footballCoach = footballCoach;
    }

    @GetMapping("/dailyWorkout")  // Used to build a URL
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

    @GetMapping("/dailyFootballCoaching")
    public String getFootballCoaching(){
        return footballCoach.getFootballCoach();
    }
}
