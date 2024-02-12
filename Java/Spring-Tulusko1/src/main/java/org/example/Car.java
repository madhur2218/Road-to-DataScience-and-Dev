package org.example;

import org.example.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public void drive(){
        System.out.println("chal rahi hai");

    }
}
