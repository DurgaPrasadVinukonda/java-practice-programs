package com.vs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Employee;
import com.vs.model.Response;
import com.vs.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/getAllEmployees")
	public List<Employee> getEmployees(Model model) {
		Response response = employeeService.getResponse();
		return response.getData();
	}
	
//	@RequestMapping("/getEmployee")
//	public Employee getEmployeeByName(@RequestParam String name) {
//		Response response =employeeService.getResponse();
//		List<Employee> employees =response.getData();
//		for (Employee employee: employees) {
//			if(employee.getEmployee_name().equals(name)) {
//				return employee;
//			}
//		}
//		return null;
//		
//		
//	}
	
	

}
