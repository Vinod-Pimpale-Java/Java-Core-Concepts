package com.string;

//Note: This is by using = sign In String Literal the jvm will create only one object if same object is already present in to pool second time
//jvm will just refer that object to new mememory location but not create another object  
public class StringLiteral {
	public static void main(String[] args) {
		String s1 = "vinod";
		String s2 = "vinod";
		System.out.println(s1 == s2); //true bcoz here only one object is created in constant pool
		System.out.println(s1.equals(s2));
	}
}
