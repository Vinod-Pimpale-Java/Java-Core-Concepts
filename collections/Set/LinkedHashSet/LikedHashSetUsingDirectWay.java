package com.collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LikedHashSetUsingDirectWay {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Raj");
		hs.add("Piyush");
		hs.add("Shraddha");
		hs.add("Manoj");
		hs.add("Shanti");
		hs.add("Manoj");// duplicats are ignor
		hs.add("Shanti");
		System.out.println(hs);

	}
}
