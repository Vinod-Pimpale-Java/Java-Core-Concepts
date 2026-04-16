package com.Java8Feactures.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterCollectionLambda {
	public static void main(String[] args) {
		List<Products> list = new ArrayList<Products>();
		list.add(new Products(1, "Samsung A5", 17000));
		list.add(new Products(3, "Iphone 6S", 65000));
		list.add(new Products(2, "Sony Xperia", 25000));
		list.add(new Products(4, "Nokia Lumia", 15000));
		list.add(new Products(5, "Redmi4 ", 26000));
		list.add(new Products(6, "Lenevo Vibe", 19000));

		// using lambda to filter data
		Stream<Products> filtered_data = list.stream().filter(p -> p.price > 20000);
		Stream<Products> filtered_data2 = list.stream().filter(p -> p.id < 4);

		// using lambda to iterate through collection
		filtered_data.forEach(products -> System.out.println(products.id + " " + products.name + " " + products.price));
		filtered_data2
				.forEach(products2 -> System.out.println(products2.id + " " + products2.name + " " + products2.price));
	}

}