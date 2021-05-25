package com.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestcontrollerApplication {
	public static void main(String[] args) {
		System.out.println("welcome to devops with aws course");
		ConfigurableApplicationContext context = SpringApplication.run(RestcontrollerApplication.class, args);
	}
}
