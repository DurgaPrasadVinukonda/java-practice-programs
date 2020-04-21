package com.vs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.vs.controllers,com.vs.model"})
public class AngularSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringApplication.class, args);
	}

}
