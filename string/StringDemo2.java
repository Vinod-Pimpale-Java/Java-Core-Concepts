package com.string;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("Ram");
		String s2 = new String("Sham");
		String s3= new String("Ram");
		System.out.println(s1 == s2);// false bcoz with new two object will created
		System.out.println(s1.equals(s2)); //false bcoz content is not same
		System.out.println(s1.equals(s3));// true as content is same
		System.out.println(s1 == s3);// false bcoz with new two objects will be created 
	}
}
