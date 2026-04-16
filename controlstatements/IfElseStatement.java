package com.controlstatements;

//Noted:- if condition true if block will execute if condition false else block is executed
public class IfElseStatement {
	public static void main(String[] args) {
		String s = "Vinod";
		int a = 25;
		if (s == "Vinod") {
			System.out.println("User verified");

		} else {
			System.out.println("Unauthoried  User");
		}
		if (a > 60) {
			System.out.println("A is greater");
		} else {
			System.out.println("A is samller ");
		}
	}
}
