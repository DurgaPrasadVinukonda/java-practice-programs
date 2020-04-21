package com.vs.exercises;

public class HelloWorldTest {

	private static final int FIRST_MARK=1;
	
	private static void printAllMarks(int[] marks, int count) {
        for (int mark :marks) {
        	System.out.println(mark);
			
		}
		
	}
	public static void main(String[] args) {
		int[] marks = {FIRST_MARK,2,3};
		printAllMarks(marks,0);
		
	}
}
