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
  }


