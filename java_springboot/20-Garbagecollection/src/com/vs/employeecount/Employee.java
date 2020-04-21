package com.vs.employeecount;

public class Employee {
	private int ID;
	private String name;
	private int age;
	private static int nextId=1;
	//it is made static becuase it is keep common and shared by all objects 
	
	public Employee(String name,int age ) {
		this.name=name;
		this.age =age;
	}
	
	public void show()
	{
		System.out.println("Id is "+ID+"Name is "+name+"Age is "+age);
	}
}
