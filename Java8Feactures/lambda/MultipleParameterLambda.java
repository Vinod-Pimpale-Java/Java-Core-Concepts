package com.Java8Feactures.lambda;

public class MultipleParameterLambda {
	public static void main(String[] args) {

		// Lambda with multiple parameters
		Addable ad1 = (a, b) ->{
			return  (a + b);
		};
		System.out.println("Addition is>>" + ad1.add(10, 20));

		// Lambda with multiple parameters with datatype

		Addable ad2 = (int a, int b) -> (a + b);
		System.out.println("Addition is>>>" + ad2.add(100, 200));
	}
}