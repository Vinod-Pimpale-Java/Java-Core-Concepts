package com.string;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = new String("PIYUSH");
		String s2 = new String("piyush");
		System.out.println(s1 == s2);// false bcoz with nnew two objects will be created
		System.out.println(s1.equals(s2));// false as content is not same samll and capital letters
		
	}
}
