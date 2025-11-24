package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.FootballCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


//    Coach coach = new CricketCoach();              this is how constructor injection works
//    Controller controller = new Controller(coach);

    private final Coach coach;
    @Autowired
    public Controller(Coach thecoach) {
        this.coach=thecoach;
    }
    @Autowired
    private FootballCoach footballCoach;

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/playingFootball")
    public String playingFootball() {
        return footballCoach.getDailyWorkout();
    }
}
