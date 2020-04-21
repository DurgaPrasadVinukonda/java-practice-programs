package com.vs.controllers;

import static org.junit.Assert.assertEquals;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
//import org.junit.internal.runners.Junit4ClassRunner;
import org.junit.runner.RunWith;

import com.vs.pojo.Employee;

@RunWith(JUnit4ClassRunner.class)
public class EmployeeControllerTest {
	
	//To declare a class a Test class we need to declare it as @Test on top of it
	@Test
	public void testEmployee() {
		Employee employee =new Employee();
		employee.setId(1);
		employee.setName("Prasad");
		employee.setSalary(1500);
		
		//This is a Methos were we will write assertEquals(Expected,Actual)
		//Need to add JUnit 5 dpendencies 
		
		assertEquals(1,employee.getId());
		
		assertEquals("Prasad",employee.getName());
		
		
		
		
	}

	

}
