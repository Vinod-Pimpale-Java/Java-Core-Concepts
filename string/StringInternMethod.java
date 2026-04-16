package com.string;

public class StringInternMethod {
	public static void main(String[] args) {

		String s1 = new String("Sachin");
		String s3="Tendulkar";
		String s2 = s1.intern();
		String s4 = s3.intern();
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
	}
}