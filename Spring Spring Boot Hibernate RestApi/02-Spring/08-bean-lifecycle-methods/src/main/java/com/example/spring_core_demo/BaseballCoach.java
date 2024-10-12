package com.example.spring_core_demo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    BaseballCoach(){
        System.out.println("in baseball coach constructor "+getClass().getSimpleName());
    }

    //defining out init method
    @PostConstruct
    public void init(){
        System.out.println("in my init method "+getClass().getSimpleName());
    }

    //defining our destroy method
    @PreDestroy
    public void cleanUp(){
        System.out.println("in my clean up method "+getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "this is baseball coach";
    }
}
