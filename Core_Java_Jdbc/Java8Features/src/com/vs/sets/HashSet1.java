package com.vs.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("One");
		set.add("Five");
		set.add("Two");
		set.removeIf(str->str.contains("Four"));
		// If I add a duplicate elements it won't display and also it doesn't maintain a order in set
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
