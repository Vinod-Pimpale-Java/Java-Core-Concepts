package com.Array;
// Passing Array to an method
//In Java, arrays are objects, and when we pass them to a method,
// we pass the reference (address) — not the actual copy.
public class ArrayToMethod {
	public static void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			System.out.println(min);

		}

	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 7 };
		min(a);
	}
}
