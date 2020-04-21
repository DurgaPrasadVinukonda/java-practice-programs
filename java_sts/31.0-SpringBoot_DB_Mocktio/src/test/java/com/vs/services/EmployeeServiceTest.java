package com.vs.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vs.application.Application;
import com.vs.pojo.Employee;
import com.vs.repository.EmployeeRepository;
import com.vs.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepository repository;
	
	@InjectMocks
	private EmployeeService employeeService;
	
	
	@Before
	public void setup() throws SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("prasad");
		employee.setSalary(4000);
		
		employees.add(employee);
		Mockito.when(repository.getEmployeeBySal(Mockito.anyInt())).thenReturn(employees);
	

}
	
	@Test
	public void testGetEmployees() throws SQLException {
		 List<Employee> employees=employeeService.getAllEmployees();
		assertEquals(1, employees.size());
//		 assertEquals(7000,employees.get(0).getSalary());
	}
}
