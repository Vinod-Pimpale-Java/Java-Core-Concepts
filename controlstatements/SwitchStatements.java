package com.controlstatements;

//Note:-Switch statements are used
public class SwitchStatements {
	public int getAddition(int a, int b) {
		int add = a + b;
		return add;
	}

	public int getSubstraction(int a, int b) {
		int sub = a - b;
		return sub;

	}

	public int getMultiplication(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public int getDivision(int a, int b) {
		int div = a / b;
		return div;

	}

	public int getModulus(int a, int b) {
		int mod = a % b;
		return mod;
	}

	public static void main(String[] args) {
		SwitchStatements sw = new SwitchStatements();
		int addition = sw.getAddition(10, 20);
		System.out.println("Addition is>>>" + addition);
		int substraction = sw.getSubstraction(10, 20);
		System.out.println("Substraction is>>>" + substraction);
		int multipication = sw.getMultiplication(10, 20);
		System.out.println("Multiplication is>>>>" + multipication);
		int division = sw.getDivision(10, 20);
		System.out.println("Division is>>>" + division);
		int modulus = sw.getModulus(10, 20);
		System.out.println("Modulus is>>>" + modulus);
	
	}

}
