package com.vs.genrics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenricClass {
	
	public static void main(String[] args) {
//	//Type casting 
//	double d= 100.4;
//	//explict type casting 
//	 float f =12.3F;
//	 //Converting to a String
//	 String m =String.valueOf(12.3F);
//	 System.out.println("Values are"+m);
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sai");
		list.add("Manikanta");
		list.add("Durga");
		list.add("Prasad");
		
		Iterator<String> val = list.iterator();
		while(val.hasNext()) {
			System.out.println(val.next());
		}
}
}
