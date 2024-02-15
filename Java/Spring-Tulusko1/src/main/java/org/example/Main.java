package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
//            Vehicle obj1 = (Vehicle) context.getBean("bike");
//            obj1.drive();

//            Tyre mrf = (Tyre) context.getBean("tyre");
//            System.out.println(mrf);
            Car obj= (Car) context.getBean("car");
            obj.drive();

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
