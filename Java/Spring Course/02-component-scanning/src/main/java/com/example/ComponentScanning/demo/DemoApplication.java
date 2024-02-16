package com.example.ComponentScanning.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// (
//		scanBasePackageClasses = //mention the base packages outside com.example.ComponentScanning.Demo
//)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
