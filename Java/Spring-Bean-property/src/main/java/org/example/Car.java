package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    private String brand;

    public Car(String brand) {
        super();
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive(){
        System.out.println("Car is driving now");
    }

}
