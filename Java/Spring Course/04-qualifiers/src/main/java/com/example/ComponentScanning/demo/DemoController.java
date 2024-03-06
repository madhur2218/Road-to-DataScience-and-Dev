package com.example.ComponentScanning.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;  //this is example of field injection
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach myCoach){
        this.myCoach= myCoach;
    }



    @GetMapping("/dailyWorkout")
    public String getDailyWorkoutBaseball() {
        return myCoach.dailyWorkout();
    }


}
