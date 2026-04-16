package com.string;

//Note: when we use new keyword to crate string jvm will create two string object
// one in stringliteral pool and other is in heap area
//but always it refer to the object from heap area
public class StringWithNewKeyword {
	public static void main(String[] args) {
		String s1 = new String("Pune");
		String s2 = new String("Pune");
		System.out.println(s1 == s2); // false as  here two object will be created
		System.out.println(s1.equals(s2));
	}
}
