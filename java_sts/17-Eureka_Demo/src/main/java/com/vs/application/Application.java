package com.vs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {
// To use a Eureka Server we need to use that Annotation
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
