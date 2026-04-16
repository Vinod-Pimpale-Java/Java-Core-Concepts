package com.collections.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
//Example of sorting HashMap by Keys

//In the following example, we use TreeMap constructor to sort the elements 
//and pass the object of HashMap class as an argument. 
public class HashMapSotByTreeMap {
	public static void main(String args[]) {
		// implementation of HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// Adding keys and values to HashMap
		hm.put(23, "Yash");
		hm.put(17, "Arun");
		hm.put(15, "Swarit");
		hm.put(9, "Neelesh");
		Iterator<Integer> itr = hm.keySet().iterator();
		System.out.println("Before Sorting");
		while (itr.hasNext()) {
			int key = (int) itr.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
		System.out.println("\n");
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("After Sorting");
		// using TreeMap constructor to sort the HashMap
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
		Iterator<Integer> itr1 = tm.keySet().iterator();
		while (itr1.hasNext()) {
			int key = (int) itr1.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
	}
}
