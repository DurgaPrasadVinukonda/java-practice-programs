package com.vs.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.vs.model.Student;


public class StudentService {
	
	@Autowired
	private DataSource datasource;
	
	public List<Student> getAllStudents() throws SQLException{
		List<Student> student = new ArrayList<Student>();
		Connection con = datasource.getConnection();
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from studentdetails");
		while(rs.next()) {
	Student st =new Student();
	st.setId(rs.getInt(1));
	st.setName(rs.getString(2));
	st.setDob(rs.getString(3));
	st.setPassword(rs.getString(4));
	st.setCpassword(rs.getString(5));
	student.add(st);
//			emp.setId(rs.getInt(1));
//			emp.setName(rs.getString(2));
//			emp.setSalary(rs.getInt(3));
//			employees.add(emp);
//			
//		}
//		return employees;
		
	}
		return student;

	
	

}
}
