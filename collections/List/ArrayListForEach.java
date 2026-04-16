package com.collections.List;

import java.util.ArrayList;

//WAP to Iterating ArrayList using For-each loop
public class ArrayListForEach {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");// Adding elements into Arraylist
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.add("Grapes");
		for (String fruit : al)
			System.out.println(fruit);
	}
}
