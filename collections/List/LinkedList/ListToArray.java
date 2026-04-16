package com.collections.List.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//How to convert List to Array
public class ListToArray {
	public static void main(String[] args) {
		List<String> fruitList = new ArrayList<>();
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		// Converting ArrayList to Array
		String[] array = fruitList.toArray(new String[fruitList.size()]);

		System.out.println("Printing Array: " + Arrays.toString(array));
		System.out.println("Printing List: " + fruitList);
	}

}
