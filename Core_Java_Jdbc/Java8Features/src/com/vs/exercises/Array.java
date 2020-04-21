package com.vs.exercises;

public class Array {
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not valid");  
		}else {
			System.out.println("Welcome To Vote");
		}
	}
	public static void main(String[] args) {
		System.out.println("Reset the Code");
		validate(13);
		System.out.println("Reset the Code");
//		try {
//			int data=100/0;
//			
//		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		}
//		System.out.println("Reset of the code");
		
	}

}
