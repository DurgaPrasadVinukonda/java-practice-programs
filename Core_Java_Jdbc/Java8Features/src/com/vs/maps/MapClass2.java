package com.vs.maps;

import java.util.HashMap;
import java.util.Map;

public class MapClass2 {
	
	public static void main(String[] args) {
		
	
	Map<Integer,String> product = new HashMap<Integer,String>();
	product.put(1, "Prasad");
	product.put(2, "Sai");
	product.put(3, "Sirisha");
	product.put(4, "Prathyusha");
	product.put(4, "sirishs");
	
	for(Map.Entry m :product.entrySet()){
		System.out.println(m.getValue());
	}
	
	product.putIfAbsent(6, "KIOPL");
	
		
}
}
