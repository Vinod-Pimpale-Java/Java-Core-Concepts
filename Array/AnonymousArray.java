package com.Array;
//AnonymousArray representation to method
public class AnonymousArray {
	public static void anonymousArray(String str[]) {
		for (int i = 1; i < str.length; i++)
			System.out.print(" "+str[i]+" ");
	}

	public static void main(String[] args) {
		anonymousArray(new String[] { "Mumbai", "Pune", "Delhi", "Kolkata", "Nagpur" });
	}
}
