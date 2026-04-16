package com.Java8Feactures.lambda;

public class SingleParameterLambda {
	public static void main(String[] args) {
		// Lambda expresion with single parameter
		Sayable1 s1 = (name) -> {
			return "Hello" + name;
		};
		System.out.println(s1.say("Piyush"));
		// You can omit function parentheses
		Sayable1 s2 = name -> {
			return "Hello" + name;

		};
		System.out.println(s2.say("Vinod"));
	}
}
