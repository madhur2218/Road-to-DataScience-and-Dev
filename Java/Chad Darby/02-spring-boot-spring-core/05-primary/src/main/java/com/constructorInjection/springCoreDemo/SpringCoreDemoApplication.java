package com.constructorInjection.springCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 public class SpringCoreDemoApplication
//		(
//		scanBasePackage ={ enter name of explicit packages to be scanned}
//)
 {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);  //SpringApplication bootstraps out Spring Boot application
	}

}
