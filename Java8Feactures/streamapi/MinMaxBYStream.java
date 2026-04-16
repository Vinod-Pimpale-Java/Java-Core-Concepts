package com.Java8Feactures.streamapi;

import java.util.ArrayList;
import java.util.List;

public class MinMaxBYStream {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 285000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// max() method to get max Product price

		Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println("Highest Price is>>>" + productA.price);

		// max() method to get max Product price

		Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println("Lowest Price is>>>" + productB.price);

	}
}
