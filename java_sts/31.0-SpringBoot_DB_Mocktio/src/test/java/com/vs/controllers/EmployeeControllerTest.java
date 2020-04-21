package com.vs.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.internal.runners.Junit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vs.application.Application;
import com.vs.pojo.Employee;
import com.vs.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
//We need to write for main progrm that is Application.class
@SpringBootTest(classes = Application.class)
public class EmployeeControllerTest {

	// To declare a class a Test class we need to declare it as @Test on top of it
//	@Test
//	public void testEmployee() {
//		Employee employee =new Employee();
//		employee.setId(1);
//		employee.setName("Prasad");
//		employee.setSalary(1500);

	// This is a Methos were we will write assertEquals(Expected,Actual)
	// Need to add JUnit 5 dpendencies

//		assertEquals(1,employee.getId());
//		
//		assertEquals("Prasad",employee.getName());

	@Mock
	private EmployeeService employeeService;

	@InjectMocks
	private EmployeeController controller;// =new EmployeeController();
	
	@Before
	public void setup() throws SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("prasad");
		employee.setSalary(4000);
		
		employees.add(employee);
		Mockito.when(employeeService.getAllEmployees()).thenReturn(employees);
	}

	@Test
	public void testGetEmployees() throws SQLException {
		 List<Employee> employees=controller.getAllEmployees();
		// assertEquals(1, employees.size());
//		 assertEquals(7000,employees.get(0).getSalary());
	}

	

}
