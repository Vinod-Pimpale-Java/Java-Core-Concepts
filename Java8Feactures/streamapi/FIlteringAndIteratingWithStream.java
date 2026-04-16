package com.Java8Feactures.streamapi;

import java.util.ArrayList;
import java.util.List;

public class FIlteringAndIteratingWithStream {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data
		// filtering using filter() of streamAPI
		//here filter() method used with lambda and pass the condition of filter
		
		productsList.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.println(product.name));
		productsList.stream().filter(product -> product.price < 30000)
		.forEach(product -> System.out.println(product.price));
	}
}
