package com.collections.List;
import java.util.ArrayList;

//Java ArrayList example to add elements
//Using add(E e) method
//Using add(int index, E element) method
//Using addAll(Collection<? extends E> c) method
//Using addAll(int index, Collection<? extends E> c) method

public class ArrayListAddMethods {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial list of elements: " + al);
		// Adding elements to the end of the list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After invoking add(E e) method: " + al);
		// Adding an element at the specific position
		al.add(1, "Gaurav");// this will add element at 2nd position as index start from 0
		System.out.println("After invoking add(int index, E element) method: " + al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		// Adding second list elements to the first list
		al.addAll(al2);// this will add 2nd Arraylist elements to first Arraylist
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + al);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("John");
		al3.add("Rahul");
		// Adding second list elements to the first list at specific position
		al.addAll(1, al3);// this will add all the arraylist in one arraylist
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + al);

	}
}
