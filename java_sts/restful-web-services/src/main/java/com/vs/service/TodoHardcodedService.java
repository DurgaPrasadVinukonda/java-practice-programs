package com.vs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vs.model.Todo;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter=0;
	static {
		todos.add( new Todo(++idCounter,"in28minutes","Learn To Dance",new Date(),false));
		todos.add(new Todo(++idCounter,"in28minutes","Learn To Micro Services",new Date(),false));
		todos.add( new Todo(++idCounter,"in28minutes","Learn To Angular",new Date(),false));
	}
	
	
	
	
	

}
