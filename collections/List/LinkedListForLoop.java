package com.collections.List;
//WAP to iterate LinkedList using for loop

import java.util.LinkedList;

public class LinkedListForLoop {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("OmSai");
		ll.add("Prvain");
		ll.add("Swati");
		ll.add("Ashwini");
		ll.add("Piyush");
		System.out.println("LinkedList Using for-loop way>>>");
		for (int i = 0; i <ll.size(); i++) {
			System.out.println(ll.get(i));
		}
	}

}
