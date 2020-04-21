package com.vs.methodreferences;

import com.vs.methodreferences.MethodRef;

public class ReferenceClass {

	public void  helloPrasad() {
		System.out.println("Hello Prasad Please Crack It");
	}
	
	public static void main (String[] args) {
		ReferenceClass ref = new ReferenceClass();
	     MethodRef mrr= ref::helloPrasad;
	     mrr.hello();
	}

}
