package com.vs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Student;
@RestController
public class StudentController {
	@RequestMapping("/Student")
	public Student getStudent() {
		Student st = new Student();
		st.setAge("22");
		st.setId(1);
		st.setName("prasadVinukonda");
		return st;
	}

}
