package com.vs.maps;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
	
	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  //Traversing to Map
//		  Set set = map.entrySet();
//		  // Now we need to traverse to Iterator
//		  Iterator itr = set.iterator();
//		  while(itr.hasNext()){
//			  Map.Entry entry =(Map.Entry) itr.next();
//			  System.out.println(entry.getKey()+"  "+entry.getValue());
//			  
//		  }
		  for(Map.Entry m:map.entrySet()) {
			  System.out.println(m.getKey()+""+m.getValue());
		  }
		
	}

}
