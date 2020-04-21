package com.vs.exercises;

public class HighestValue {
	
	public static void main(String[] args) {
		int[] str=  {1,2,34,5};
		
		int max;
		for ( int i =0;i<str.length;i++) {
			if (str[i]<str[i+1]) {
				max = str[i];
				System.out.println(max);
			}
			
		}
		
	}

}
