package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

         //For Car
        Car ford = (Car) context.getBean("car");
        ford.drive();

        // For Vehicle
//        Vehicle suzuki = (Vehicle) context.getBean("car");
//        suzuki.drive();


//        Tyre mrf1 = (Tyre) context.getBean("tyre");
//        System.out.println(mrf1);
    }
}
