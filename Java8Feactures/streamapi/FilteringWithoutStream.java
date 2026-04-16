package com.Java8Feactures.streamapi;

import java.util.ArrayList;
import java.util.List;

public class FilteringWithoutStream {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		//here we need to create another ArrayList to save filtered products into list
		List<Float> productPriceList = new ArrayList<Float>();
		//we need to iterate ArrayList elements again in this case using for each loop
		
		//As here two objects are created one for original list(prodcutList) 
		//and second for Filtered list(productPriceList) more memory space will required.
		for (Product product : productsList) {

			// Filtering data from list

			if (product.price < 30000) {
				// adding price to a productPriceList
				productPriceList.add(product.price);

			}
		}
		// displaying data
		System.out.println(productPriceList);
	}
}
