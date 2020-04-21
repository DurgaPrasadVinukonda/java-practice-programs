package com.vs.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private static final Logger logger =LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		System.out.println("Current Directory = " + System.getProperty("user.dir"));
	      
	      logger.info("just a test info log");
		SpringApplication.run(Application.class, args);
	}

}
