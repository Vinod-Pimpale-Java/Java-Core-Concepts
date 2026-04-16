package com.operators;

//Note:- In Bitwise Operator it check both the conditions
public class BitwiseOperatos {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		int a = 40;
		// Bitwise And &
		System.out.println(x > y & y > z); // T && F= F
		System.out.println(x < y & y < z); // T && T= T

		// Bitwise Or|
		System.out.println(x > y | z > a); // F | F=F
		System.out.println(x < y | z < a); // T | T=T
	}
}
