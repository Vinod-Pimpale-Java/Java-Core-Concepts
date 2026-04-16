package com.collections.List.LinkedList;

import java.util.LinkedList;

//WAP to iterate LinkedList using forEachMethod()
public class LinkedListIteratorforEachMethod {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("OmSai");
		ll.add("Prvain");
		ll.add("Swati");
		ll.add("Ashwini");
		ll.add("Piyush");
		System.out.println("LinkedList Using ForEach() method way>>>");
		ll.forEach(a -> {
			// Here, we are using lambda expression
			System.out.println(a);

		});
	}
}
