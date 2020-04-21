package com.vs.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Employee;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeController {
	
	public  static List<Employee> createList(){
		List<Employee> tempEmployees= new ArrayList<>();
		Employee emp1 =new Employee();
		emp1.setEmpId("1");
		emp1.setName("Prasad");
		emp1.setSalary(7000);
		emp1.setDesignation("MLA");
		Employee emp2 = new Employee();
		emp2.setEmpId("2");
		emp2.setName("Vinukonda");
		emp2.setDesignation("Software Developer");
		emp2.setSalary(5678);
		return tempEmployees;
		
	}

	public List<Employee> employees =new ArrayList<>(createList());
	
	@RequestMapping("/employees")
	public List<Employee> firstPage(){
		List<Employee> tempEmployees= new ArrayList<>();
		Employee emp1 =new Employee();
		emp1.setEmpId("1");
		emp1.setName("Prasad");
		emp1.setSalary(7000);
		emp1.setDesignation("MLA");
		Employee emp2 = new Employee();
		emp2.setEmpId("2");
		emp2.setName("Vinukonda");
		emp2.setDesignation("Software Developer");
		emp2.setSalary(5678);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
		
		
	}


	
}
