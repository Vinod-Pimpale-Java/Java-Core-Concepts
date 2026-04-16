package com.collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUsingIteratorWay {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Piyush");
		hs.add("Raj");
		hs.add("Sudisha");
		hs.add("Shanti");
		hs.add("Shraddha");
		hs.add("Shanti"); // duplicates will be ignored into HashSet
		hs.add("Shraddha");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
