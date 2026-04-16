package com.collections.List.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//How to convert Array to List
public class ArrayToList {
	public static void main(String[] args) {
		String str[] = { "Vinod", "Pravin", "Ashwini", "Swati" };
		System.out.println("Printing array>>>" + Arrays.toString(str));
		List<String> li = new ArrayList<String>();
		// Converting array to list
		for (String string : str) {
			li.add(string);
		
		}
		System.out.println("Printing list>>>" + li);
	}
}
