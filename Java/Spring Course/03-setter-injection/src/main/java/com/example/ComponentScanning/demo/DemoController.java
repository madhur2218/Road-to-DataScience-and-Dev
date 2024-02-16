package com.example.ComponentScanning.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private final Coach cricketCoach;
    @Autowired
    private final Coach footballCoach;

    @Autowired
    public DemoController(Coach cricketCoach, Coach footballCoach) {
        this.cricketCoach = cricketCoach;
        this.footballCoach = footballCoach;
    }

    @GetMapping("/dailyworkoutCricket")
    public String getDailyWorkoutCricket() {
        return cricketCoach.getdailyWorkout();
    }

    @GetMapping("/dailyworkoutFootball")
    public String getDailyWorkoutFootball() {
        return footballCoach.getdailyWorkout();
    }
}
