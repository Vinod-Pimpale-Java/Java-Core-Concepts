package com.collections.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

//WAP to Iterate the LinkedList Using Iterator Way
public class LinkedListIteratorWay {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("OmSai");
		ll.add("Prvain");
		ll.add("Swati");
		ll.add("Ashwini");
		ll.add("Piyush");
		System.out.println("LinkedList Using Iterator way>>>");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
