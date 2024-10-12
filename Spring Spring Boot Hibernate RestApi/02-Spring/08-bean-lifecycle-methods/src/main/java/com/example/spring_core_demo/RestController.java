package com.example.spring_core_demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public RestController(@Qualifier("baseballCoach") Coach myCoach) {
        System.out.println("In constructor: "+getClass().getSimpleName());
        this.myCoach = myCoach;
    }


    @GetMapping("/")
    public String coach(){
        return myCoach.getDailyWorkout();
    }


}
