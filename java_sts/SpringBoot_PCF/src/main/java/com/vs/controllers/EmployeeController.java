package com.vs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Employee;
@RestController
public class EmployeeController {
	
	@RequestMapping("/employee")
	public Employee firstpage() {
		Employee emp =new Employee();
		emp.setName("Prasad Vinukonda");
		emp.setEmpID("1");
		emp.setDesignation("Manager");
		emp.setSalary(3000);
		return emp;
		
	
	}

}
