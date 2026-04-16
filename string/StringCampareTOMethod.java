package com.string;

//Note: CompareTo method compare the string alphabetically i.e. lexicographically
// if s1==s2 return 0 , s1>s2 return positive value, s1<s2 retrun negative value
public class StringCampareTOMethod {
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Raj";

		System.out.println(s1.compareTo(s2)); //0
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));

	}
}
