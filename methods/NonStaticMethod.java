package com.methods;

public class NonStaticMethod {
	public void test() {
		System.out.println("This is NonStatic method");

	}

	public String getName(String name) {// Vinod is stored into name
		return name;

	}

	public static void main(String[] args) {
		// Note: To call non-static method we have to create object of class compulsory
		NonStaticMethod nm = new NonStaticMethod();// creating object od the class
		nm.test(); // calling non-static method by using object of the class
		String s = nm.getName("Vinod");// passing string argument
		System.out.println("My name is>>>" + s);
	}

}
