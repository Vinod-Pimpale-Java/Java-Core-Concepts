package com.collections.Map.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Enter the First number");
		Scanner sc = new Scanner(System.in);
		int FirstNumb = sc.nextInt();
		System.out.println("Enter the Second number");
		int SecondNumb = sc.nextInt();
		if (FirstNumb > SecondNumb) {
			System.out.println("Number is large");
		}

		else {
			System.out.println("Number is Small");
		}

	}
}
