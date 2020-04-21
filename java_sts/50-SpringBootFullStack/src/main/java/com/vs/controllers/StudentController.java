package com.vs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class StudentController {
	
	@RequestMapping("/createStudent")
	public String getRegistration() {
		
		return "registration";
	}
	

}
