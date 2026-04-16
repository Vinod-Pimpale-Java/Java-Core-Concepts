package com.string;

public class StringDemo1 {
	public static void main(String[] args) {
		String s1 = "Piyush";
		String s2 = new String("Vinod");
		System.out.println(s1 == s2); // false bcoz two object will be created
		System.out.println(s1.equals(s2));// false bcoz 
	}
}
