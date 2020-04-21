package com.vs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Durga Prasad You are deploying a Docker Application";
	}

}
