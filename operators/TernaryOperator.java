package com.operators;

//Note:- ? use to write single condition of if else into single line
public class TernaryOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int num = (x > y) ? x : y;
		int num1 = (x < y) ? x : y;
		// if condition is true it will print first int if false it will print second
		
		System.out.println(num);
		System.out.println(num1);
	}
}
