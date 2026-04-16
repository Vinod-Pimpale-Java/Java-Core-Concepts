package com.string;

//Note: two ways with (int startIndex) and 2nd with both(int startInex , int endIndex)
public class StringSubstracting {
	public static void main(String[] args) {
		String s1 = "This is Piyush";
		System.out.println("Orginal String>>>" + s1);
		// using only startIndex
		System.out.println("using only startIndex");
		System.out.println("String from Index 6>>>" + s1.substring(6));
		System.out.println("using both startIndex and endIndex");
		System.out.println("String from Index 5 to12>>" + s1.subSequence(5, 12));
	}
}
