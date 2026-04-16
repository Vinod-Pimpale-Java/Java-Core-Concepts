package com.Array;

public class OutOfIndex {
	public static void main(String[] args) {
		int arr[] = { 50, 60, 70, 80, 90 ,100,101,102};
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
