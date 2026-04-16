package com.Array;

// In multidiamentional Data is stored into row and columns
//int arr[][]= new int[3][3]
public class MultidiArray {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 6, 7, 8}, { 11, 22, 33} };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" "+arr[i][j] + " ");
			}
			System.out.println();// for new line
		}
		
	}
}
