																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					package com.Java8Feactures.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Piyush");
		li.add("Vinod");
		li.add("Shraddha");
		li.add("Amol");

		li.forEach((n) -> System.out.println(n));
	}
}
