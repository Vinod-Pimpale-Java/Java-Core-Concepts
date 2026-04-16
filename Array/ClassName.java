package com.Array;

// to find the class name of the array us ethe method as getClass().getName() method.
public class ClassName {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println("Class name is >>>" + name);
	}
}
