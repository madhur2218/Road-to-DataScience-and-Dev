package com.luv2code.springboot.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

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

  }


