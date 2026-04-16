package com.Array;

public class AdditionOfMatrix {
	public static void main(String[] args) {
		int a[][] = { { 210, 20, 30 }, { 10, 20, 30 } };
		int b[][] = { { 40, 50, 60 }, { 40, 50, 60 } };
		// create another matrix to store sum
		int c[][] = new int[2][3];
		// Adding and printing sum of two matrix
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(" " + c[i][j] + " ");
			}
		}

	}
}
