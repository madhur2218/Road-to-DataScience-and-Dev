package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
            Vehicle obj1 = (Vehicle) context.getBean("bike");
            obj1.drive();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
