package com.controlstatements;

import java.util.Scanner;

//Note:-if else if ladder statement execute one condition from multiple statements
public class IfElseIfLadderStatement {

	public static void main(String[] args) {

		System.out.println("Enter marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks<= 25) {
			System.err.println("FAIL");
		} else if (marks >= 50 && marks < 65) {
			System.out.println("D grade");
		} else if (marks >= 65 && marks < 75) {
			System.out.println("C grade");
		} else if (marks >= 75 && marks < 85) {
			System.out.println("B grade");
		} else if (marks >= 85 && marks < 100) {
			System.out.println("A grade");
		} else {
			System.out.println("Incorrect input");
		}
	}
}
