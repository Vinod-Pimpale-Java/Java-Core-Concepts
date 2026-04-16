package com.collections.List.LinkedList;

import java.util.LinkedList;

//WAP TO ITERATE LINKEDLIST USING FOR ECACH LOOP
public class LinkedListForEach {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("OmSai");
		ll.add("Prvain");
		ll.add("Swati");
		ll.add("Ashwini");
		ll.add("Piyush");

		System.out.println("LinkedList using for eachloop>>>");
		for (String names : ll)

			System.out.println(names);

	}
}
