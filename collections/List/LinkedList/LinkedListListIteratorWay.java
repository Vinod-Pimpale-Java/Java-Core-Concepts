package com.collections.List.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

//WAP to iterate the LinkedList in reverse order
public class LinkedListListIteratorWay {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("OmSai");
		ll.add("Prvain");
		ll.add("Swati");
		ll.add("Ashwini");
		ll.add("Piyush");
		System.out.println("LinkedList Using ListIterator way>>>");
		ListIterator<String> litr = ll.listIterator(ll.size());
		while (litr.hasPrevious()) {
			String str = litr.previous();
			System.out.println(str);
		}
	}
}
