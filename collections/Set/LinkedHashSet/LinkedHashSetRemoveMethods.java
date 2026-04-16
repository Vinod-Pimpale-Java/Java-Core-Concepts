package com.collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetRemoveMethods {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("Raj");
		hs.add("Piyush");
		hs.add("Shraddha");
		hs.add("Manoj");
		hs.add("Shanti");
		// Removing an element from the above linked Set
		hs.remove("Manoj");
		System.out.println("After Romoving element" + hs);
		System.out.println("Remove specific element from list");
		hs.removeIf(str -> str.contains("Shanti"));
		System.out.println("After removing specific element shanti" + hs);
	}
}
