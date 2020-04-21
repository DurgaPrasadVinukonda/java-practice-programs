package com.vs.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.pojo.Student;

@RestController
public class StudentController {
	@RequestMapping("/createStudent")
	public List<Student> createStudent(@PathVariable Integer id,@PathVariable String name,@PathVariable String country) {
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setCountry(country);
		
		
		
		
		
	}

	@RequestMapping("/deleteStudent")
	public Student deleteStudent() {
		
		return null;
	}

	@RequestMapping("/updateStudent")
	public String updateStudent() {
		return "Updates a Student";
	}

	@RequestMapping("/getStudent")
	public String getStudent() {
		return "Students List will Prints";
	}

}
