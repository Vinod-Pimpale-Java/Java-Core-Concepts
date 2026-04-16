package com.Java8Feactures.lambda;

//You must use return keyword when lambda expression contains multiple statements.
//It means when we use { } the must give return type. means lambda expression contains body
public class WithoutReturnLambda {
	public static void main(String[] args) {

		// Lambda without return keyword
		Addable ad1 = (a, b) -> (a + b);
		System.out.println("Addition is>>" + ad1.add(20, 20));

		// Lambda with return keyword as it contains body i.e. multiple statements a+b
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println("Addition is>>>" + ad2.add(200, 200));
	}
}