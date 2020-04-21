package com.vs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.HelloWorldBean;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String helloWorld() {
		return "hello-world";
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
//		throw new RuntimeException("Something Occured Wrong");
       return new HelloWorldBean("Hello World");
	}
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s",name));
	}

}
