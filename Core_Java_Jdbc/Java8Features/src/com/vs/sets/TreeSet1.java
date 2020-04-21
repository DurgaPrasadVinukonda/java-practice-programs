package com.vs.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		// It maintainsa a Ascending order and dont allow a duplicate elements 
	
	TreeSet<Integer> treeSet=new TreeSet<Integer>();
	
	treeSet.add(97);
	treeSet.add(56);
	treeSet.add(89);
	treeSet.add(78);
	
	Iterator<Integer> i = treeSet.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	
	

}
}
