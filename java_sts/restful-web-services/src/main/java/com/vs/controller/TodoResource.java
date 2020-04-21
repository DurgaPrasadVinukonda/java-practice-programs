package com.vs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Todo;
import com.vs.service.TodoHardcodedService;

@RestController
public class TodoResource {
	
	private TodoHardcodedService todoService;
	
	public List<Todo> getAllTodos(String username){
		
		
		return todoService.getAllTodos;
	}

}
