package com.collections.Set.HashSet;

import java.util.HashSet;

public class HashSetUsingForEachLoop {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(11);
		hs.add(3);
		hs.add(9);
		hs.add(4);
		hs.add(5);
		for (Integer itr : hs)
			System.out.println(itr);

	}
}
