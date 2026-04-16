package com.collections.List;

import java.util.ArrayList;
import java.util.Collections;

//WAP to Sort ArrayList
//Collectionss.sort(listobject) this method will used to sort the ArrayList
//String will sort Alphabetically
//Integers sort in assending order
public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mango");// Adding elements into Arraylist
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		System.out.println("Befor Sorting Sting Arraylist");
		for (String fruit1 : list1)
			System.out.println(fruit1);

		// Sorting the list
		Collections.sort(list1);
		System.out.println("After Sorting String ArrayList>>>");
		// Traversing list through the for-each loop
		for (String fruit : list1)
			System.out.println(fruit);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(12);
		list2.add(7);
		list2.add(50);
		list2.add(9);
		System.out.println("Befor Sorting Integer ArrayList>>>");
		for (Integer num1 : list2)
			System.out.println(num1);
		// Sorting the list
		Collections.sort(list2);
		// Traversing list through the for-each loop
		System.out.println("After Sorting Integer ArrayList>>>");
		for (Integer num : list2)
			System.out.println(num);

	}

}
