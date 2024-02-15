package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Bike v1 = new Bike();
//        v1.drive();
//        Vehicle obj1 = new Car();   This is the normal method of creating Objects
//        obj1.drive();

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

        //For Car
        Car ford= (Car) context.getBean("car");
        ford.drive();

        //For Vehicle
        Vehicle suzuki= (Vehicle) context.getBean("car");
        suzuki.drive();


    }
}