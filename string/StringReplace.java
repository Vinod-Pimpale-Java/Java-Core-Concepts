package com.string;

// used to replace all occurance of first sequance of character with second sequace of character
//Ex we can replace any repated word/num by other word/num
public class StringReplace {
	public static void main(String[] args) {
		System.out.println("Actual String");
		String s1 = "Java is programming language. Java is very easy. Java is mostly used";
		System.out.println(s1);
		System.out.println("Replaced String");
	String replace=	s1.replace("Java", "Python");
	System.out.println(replace);
	}
}
