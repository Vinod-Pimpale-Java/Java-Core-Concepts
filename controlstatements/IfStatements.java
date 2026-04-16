package com.controlstatements;

//Note: if statement is true then if block is executed
public class IfStatements {
	public static void main(String[] args) {
		int a = 10;
		if (a > 100) { // Note: if statement is true then if block is executed
		}
		System.out.println("A is greater");
		if (a > 20) { // Note: condition is false so jvm will not enter into if block
			System.out.println("A is smaller");
		}
	}
}
