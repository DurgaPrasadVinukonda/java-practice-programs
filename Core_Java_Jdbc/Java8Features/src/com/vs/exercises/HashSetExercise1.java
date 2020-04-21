package com.vs.exercises;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExercise1 {
	
	public static void main (String[] args) {
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		set.add("Mangao");
		set.add("Orange");
		set.add("Yellow");
		set.add("Banana");
		// To get List and size and now we need to wroite a remove all methods
		//set.removeAll(set);
		if(set.size()>0) {
			System.out.println("It is not Empty");
		} else {
			System.out.println("It's Empty");
		}
		Iterator<String> itr= set.iterator();
		System.out.println(set.size());
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
