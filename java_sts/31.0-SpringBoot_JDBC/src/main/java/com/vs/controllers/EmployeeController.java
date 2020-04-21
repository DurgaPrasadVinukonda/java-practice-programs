package com.vs.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.pojo.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private DataSource dataSource;
	
	@RequestMapping("/getEmployees")
	public List<Employee> getAllEmployees() throws SQLException{
		List<Employee> employees =new ArrayList<Employee>();
		Connection con = dataSource.getConnection();
		Statement st =con.createStatement();
		ResultSet rs =st.executeQuery("select * from employee");   
		
		while(rs.next()) {
			Employee emp =new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getInt(3));
			employees.add(emp);
			
		}
		return employees;
		
	}

}
