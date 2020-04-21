package com.vs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vs.model.Student;

@Controller
public class StudentController {
	
	
	
	@RequestMapping("/addStudent")
	public String addStudent(Model model) {
		model.addAttribute("student", new Student()); 
		return "registration";
	}
	
	
	@RequestMapping("/viewStudent")
	public String displayStudent(@ModelAttribute Student student) {
		return "student";
	}
	
//	@RequestMapping("/viewStudent")
//	public String displayStudent(Model model) {
//		Student st = new Student();
//		st.setId(1);
//		st.setName("Prasad");
//		st.setCountry("USA");
//		
//		model.addAttribute("studentObj", st);
//		return "student";
//	}

}
