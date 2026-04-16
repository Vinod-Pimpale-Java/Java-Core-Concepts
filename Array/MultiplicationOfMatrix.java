package com.Array;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		// creating two matrix
		int a[][] = { { 2, 3, 4 }, { 5, 6, 7 }, { 5, 6, 7 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 7, 3 } };
		// creating one matrix to store multipication
		int c[][] = new int[3][3];
		// multiplying and printing multipiction
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] = a[i][k] * b[j][k];
				}
				System.out.print(" " + c[i][j] + " ");
			}
			System.out.println();// new line
		}
	}
}