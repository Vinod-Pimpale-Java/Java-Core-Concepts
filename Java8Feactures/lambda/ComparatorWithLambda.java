package com.Java8Feactures.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.Java8Feactures.lambda.Products;

public abstract class ComparatorWithLambda 	{
	public static void main(String[] args) {
		// Adding Products
		List<Products> list = new ArrayList<Products>();
		list.add(new Products(1, "HP Laptop", 59666));
		list.add(new Products(1, "Table Lamp", 2300));
		list.add(new Products(1, "Keyboard", 2500));
		list.add(new Products(1, "Bag", 3000));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Products p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		System.out.println("Sorting on the basis of price...");
		Collections.sort(list, (p2,p3)->{
			if (p2.price == p3.price)

				return 0;
			else if (p2.price > p3.price)
				return 1;
			else
				return -1;
		});
		for (Products pp : list) {
			System.out.println(pp.id + " " + pp.price);
		}
		

	}


	}

