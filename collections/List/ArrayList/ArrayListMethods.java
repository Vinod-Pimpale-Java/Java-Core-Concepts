package com.collections.List.ArrayList;
import java.util.ArrayList;

	//WAP to demonstrate all methods in arraylist
public class ArrayListMethods {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();
	al.add("Pune");
	al.add("Mumbai");
	al.add("Benglore");
	al.add("Nashik");
	al.add("Delhi");
	//to print element at index 1
	System.out.println(al.get(1));
	//to print all elements
	System.out.println(al);
	//To check where element preset in ArrayList or Not
	System.out.println(al.contains("Delhi"));
	//To find index of particular element in ArrayList
	System.out.println(al.indexOf("Nashik"));
	//to check is array empty or not T or F
	System.out.println(al.isEmpty());
	//To print last index element of ArrayList
	System.out.println(al.lastIndexOf("Pune"));
	//To remover index of particular index
	System.out.println(al.remove(2));
	//To convert ArrayList into String
	System.out.println(al.toString());
	//To Know the size of Array
	System.out.println(al.size());
}
}
