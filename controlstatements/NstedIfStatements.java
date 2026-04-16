package com.controlstatements;

// Note:- used as if block inside other if block
// inner if block execute only if outer if block condition is true
public class NstedIfStatements {
	public static void main(String[] args) {

		String s = "Male";
		int a=75;
		if (s == "Male") {
			if (s.equals("Male")) {
				System.out.println("Only male are allowed");
			}
		}
		if(a>=20) {
			if(a>40) {
			System.out.println("A is greater");	
			}
		}
	}
}
