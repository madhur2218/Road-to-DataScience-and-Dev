package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Samsung s7 = new Samsung();
//        s7.Config();

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.Config();
    }
}
