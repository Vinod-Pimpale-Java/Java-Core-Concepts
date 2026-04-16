package com.collections.Set.HashSet;

import java.util.HashSet;

public class HashSetUsingGenerics {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		System.out.println(hs);
	}
}
