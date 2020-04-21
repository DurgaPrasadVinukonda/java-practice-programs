package com.vs.streams;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"HpLaptop",25000f));
		productsList.add(new Product(2,"Lenova",35000f));
		productsList.add(new Product(3,"Samsung",45000f));
		productsList.add(new Product(4,"Apple",55000f));
		

	}

}
