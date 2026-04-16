package com.Java8Feactures.lambda;

public class NoParameterLambda {
public static void main(String[] args) {
	 Sayable s=()->{
		return "I am Awesome"; 
	 };
	 System.out.println(s.say());
}
}
