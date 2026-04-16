package com.collections.List;

import java.util.ArrayList;
import java.util.Iterator;

//WAP TO Iterating ArrayList using Iterator
public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();// Creating arraylist
		al.add("Mango");// Adding elements into Arraylist
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.add("Grapes");
		// Traversing list through Iterator
		Iterator<String> itr = al.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}
	}
}
