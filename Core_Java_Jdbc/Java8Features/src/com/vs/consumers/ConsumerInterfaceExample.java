package com.vs.consumers;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {
	
	static void printMessage(String name) {
		System.out.println("Hello"+name);
	}
	
	static void printValue(int val) {
		System.out.println(val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> consumer1= ConsumerInterfaceExample::printMessage;
		consumer1.accept("Prasad");
		Consumer<Integer> consumer2=ConsumerInterfaceExample::printValue;
		consumer2.accept(12);

	}

}
