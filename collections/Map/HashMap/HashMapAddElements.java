package com.collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

//Let's see a simple example of HashMap to store key and value pair.
public class HashMapAddElements {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		System.out.println("Iterating Hashmap...");
		//here Map.Entiry is inteface have getKey() and getValue() methods
		//But we can not create the object of interface so we call entry.Set method of 
		//Map Interface to get instance of Map.Entry
		
		for (Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
