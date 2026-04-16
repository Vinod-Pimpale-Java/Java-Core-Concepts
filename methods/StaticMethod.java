package com.methods;

public class StaticMethod {
	public static void test() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		StaticMethod.test(); // calling static method by using class name
		StaticMethod sm = new StaticMethod(); // creating object of class
		sm.test(); // calling static method using object
	}
}
