package com.vs.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeController {
	
	private List<Employee> employees = createList();
	

	//Where here we are using a @Cross origins because we are calling controller from different domain
	
}
