package com.vs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Employee;

@CrossOrigin(origins="http://localhost:9000")
@RestController
public class TestController {
	
	private List<Employee> employees = createList();
	
	@RequestMapping(value="/employees", method=RequestMethod.GET, produces="application/json")
	public List<Employee> firstpage(){
		return employees;
	}
	
	private static List<Employee> createList() {
		List<Employee> tempEmployees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setName("emp1");
		emp1.setDesignation("manager");
		emp1.setEmpId("1");
		emp1.setSalary(3000);

		Employee emp2 = new Employee();
		emp2.setName("emp2");
		emp2.setDesignation("developer");
		emp2.setEmpId("2");
		emp2.setSalary(3000);
		Employee emp3 = new Employee();
		emp3.setName("Prasad");
		emp3.setDesignation(" Java developer");
		emp3.setEmpId("3");
		emp3.setSalary(6000);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		tempEmployees.add(emp3);
		return tempEmployees;
	}

	@DeleteMapping(path = { "/{id}" })
	public Employee delete(@PathVariable("id") int id) {
		Employee deletedEmp = null;
		for (Employee emp : employees) {
			if (emp.getEmpId().equals(id)) {
				employees.remove(emp);
				deletedEmp = emp;
				break;
			}
		}
		return deletedEmp;
	}
	
	@PostMapping("/employe")
	public Employee create(@RequestBody Employee user) {
		employees.add(user);
		System.out.println(employees);
		return user;
	}
	

}
