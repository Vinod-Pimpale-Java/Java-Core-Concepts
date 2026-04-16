package com.string;

// Two ways using  + i.e. concade operator and second concat() method
public class StringConcatenation {
	public static void main(String[] args) {
		String s1 = "Piyush";
		String s2 = "Gaikwad";
		String s= s1.concat("Pandit");		// using concat operator
		System.out.println(s);
		System.out.println("using concat operator>>>");
		System.out.println(s1 + " " + s2);
		// using concat method
		System.out.println("using concat method>>>");
		System.out.println(" " + s1.concat(s2) + " ");
	}
}
