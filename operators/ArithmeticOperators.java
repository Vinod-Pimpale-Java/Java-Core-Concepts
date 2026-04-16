package com.operators;
//Notes:- Used for mathematical calculations
public class ArithmeticOperators {
	int x = 20;
	int y = 40;

	public static void main(String[] args) {
		int x1 = 20;
		int y1 = 40;

		ArithmeticOperators ao = new ArithmeticOperators();
		int a = ao.x + ao.y;// accessing global variables
		System.out.println("Addiction is>>>" + a);
		System.out.println("Substraction is>>>" + (x1 - y1));
		System.out.println("Multiplication is>>>" + (x1 * y1));
		System.out.println("Division is>>>" + (x1 / y1));
		System.out.println("moduless is>>>" + (x1 % y1));

	}
}
