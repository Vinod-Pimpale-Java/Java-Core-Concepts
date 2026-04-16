package com.collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

//No Duplicate Key on HashMap
public class HashMapNoDuplicats {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes"); // trying duplicate key is not allowded
		map.put(5, "Grapes"); // trying duplicate value is allowed
		// Itegarating the values from HashMap
		for (Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
