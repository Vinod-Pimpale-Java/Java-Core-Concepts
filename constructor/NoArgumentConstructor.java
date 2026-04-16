package com.constructor;

//Note: No Argument or default constructor do not accept any argument into it.
public class NoArgumentConstructor {
	String name;

	public NoArgumentConstructor() {
		name = "Vinod Pimpale.";
	}

	public static void main(String[] args) {
		NoArgumentConstructor no = new NoArgumentConstructor();
		System.out.println("My name is >>>" +no.name);
	}
}
