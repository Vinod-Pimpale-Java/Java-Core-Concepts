package com.operators;
//Note:- Right Shift operator >> used to move left operand value to right by assigned bits by right operand
//Note:- Left Shift operator >> used to shift all the bits in a value to the left side of a assigned numbers of times
public class ShiftOperator {
 public static void main(String[] args) {
	int a=10;
	System.out.println(a<<2); //10*2^2
	System.out.println(a<<3); //10*2^3
	System.out.println(a>>2); //10/2^3
	System.out.println(a>>3); //10/2^3
	
}
}
