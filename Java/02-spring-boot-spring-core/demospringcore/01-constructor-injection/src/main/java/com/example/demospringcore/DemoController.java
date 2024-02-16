package com.example.demospringcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private Coach cricket_coach;
    @Autowired
    private Coach football_coach;


//    public DemoController(Coach coach){
//        cricket_coach =coach;
//    }

    @GetMapping("/dailyworkout")
        public String getDailyWorkout(){
            return cricket_coach.getdailyWorkout();

        }

        @GetMapping("/dailyWorkout/Football")
        public String getDailyWorkout1(){
            return football_coach.getdailyWorkout();

        }



}
