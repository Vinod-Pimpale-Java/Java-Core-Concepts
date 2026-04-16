package com.collections.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetIterateMethods {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("Raj");
		hs.add("Piyush");
		hs.add("Shraddha");
		hs.add("Manoj");
		hs.add("Shanti");
		// using Iterator way
		System.out.println("LinkedHashSet Iterator Way");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("LinkedHashSet forEachLoop Way");
		for (String str : hs)
			System.out.println(str);

	}

}
