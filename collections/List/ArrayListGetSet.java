package com.collections.List;

import java.util.ArrayList;

//WAP TO Get and Set ArrayList
public class ArrayListGetSet {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");// Adding elements into Arraylist
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		
		// accessing the element it will return the 2nd element, because index starts
		// from 0
		System.out.println("Returning/Getting element at perticular index"+" " + al.get(1));
		// changing/ setting the element at perticular index
		System.out.println("seting element at perticular index"+ " " + al.set(3, "Tomato"));
		// Traversing list using for each loop
		for (String fruit : al)
			System.out.println(fruit);
	}
}
