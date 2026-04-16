package com.collections.List.LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

//Java LinkedList Example to reverse a list of elements
public class LinkedListReverse {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("OmSai");
		ll.add("Prvain");
		ll.add("Swati");
		ll.add("Ashwini");
		ll.add("Piyush");
		ll.add("Anuj");
		ll.add("Gaurav");
		Iterator<String> itr = ll.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
