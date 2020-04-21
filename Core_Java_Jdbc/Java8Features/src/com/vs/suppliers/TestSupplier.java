package com.vs.suppliers;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Person> supplier = ()->{
			return new Person("Prasad",30,"Software Developer");
		};
		Person p = supplier.get();
		System.out.println(p.getAddress()+ " "+p.getAge()+" "+p.getName());

	}

}
