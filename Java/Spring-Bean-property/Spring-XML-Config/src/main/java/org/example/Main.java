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

        //For Bike
        Vehicle obj1 = (Vehicle) context.getBean("bike");
        obj1.drive();

        //For car
        Vehicle obj2 = (Vehicle) context.getBean("car");
        obj2.drive();

        Car obj3 = (Car) context.getBean("car");
        obj3.drive();


    }
}