package com.example.ComponentScanning.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private Coach cricketCoach;


 public void setCoach(Coach cricketCoach){
     this.cricketCoach= cricketCoach;
 }

    @GetMapping("/dailyworkoutCricket")
    public String getDailyWorkoutCricket() {
        return cricketCoach.dailyWorkout();
    }


}
