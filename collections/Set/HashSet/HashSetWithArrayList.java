package com.collections.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Java HashSet from another Collection
public class HashSetWithArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ajay");
		list.add("Vjay");
		list.add("Rajesh");
		list.add("Radha");
		// Passing Arraylist Object to HashSet
		HashSet<String> set = new HashSet<String>(list);// Passing ArrayList Object
		set.add("Piyush");
		set.add("Raj");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
