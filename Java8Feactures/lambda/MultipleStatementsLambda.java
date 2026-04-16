package com.Java8Feactures.lambda;
//Here we are using two String statements so must use return type
public class MultipleStatementsLambda {
	public static void main(String[] args) {

		Sayable2 s1 = (message) -> {
			String s = "You are brave,";
			String s2=s+message;
			return s2;
		};
		System.out.println(s1.say(" I always believed in you."));
	}
}
