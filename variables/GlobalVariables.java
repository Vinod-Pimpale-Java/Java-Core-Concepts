package com.variables;

public class GlobalVariables {
	// NOTE:-
	// Declared outside method body
	// Scope is throughout class
	// store into heap area
	// they can be static
	// they can initialized automatically and default value is 0

	int a; // Declaration of Global variables
	int b = 30; // initialization of Global variables

	public static void main(String[] args) {
		// To access global variables into main method need to create object of the
		// class and the access it, else make global variables static
		// As we are using the static keyword, we can directly call the variable. If we
		// don't use static keywords,
		// the object of the class is required to access the variable.
		GlobalVariables gv = new GlobalVariables();
		System.out.println("Default value of a is>>>" + gv.a + "<<<<Defalut value is zero");
		System.out.println("Value of b is>>>" + gv.b);

	}
}
