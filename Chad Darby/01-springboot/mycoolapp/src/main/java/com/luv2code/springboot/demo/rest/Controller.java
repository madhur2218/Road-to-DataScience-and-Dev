package com.luv2code.springboot.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose "/" that return "Hello World"
      @GetMapping("/")
        public String hello() {
          return "Hello World";
      }

      @GetMapping("/cooking")
          public String cooking(){
              return "I love cooking!";
          }

      @GetMapping("/health")
        public String health(){
            return "I love health!";
        }

        @GetMapping("eating")
            public String eating(){
                return "I love eating!";
            }
        @GetMapping("travelling")
            public String travelling(){
                return "I love travelling!";
        }

        //Exposing endpoint for coach name and team name
        @GetMapping("/coachName")
            public String getCoachName(){
                return "Coach Name: " + coachName;
        }

        @GetMapping("/teamName")
            public String getTeamName(){
                return "Team Name: " + teamName;
        }

  }


