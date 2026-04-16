package com.Array;

//Returing Array from Method
public class ReturingArrayFromMethod {
// creating method which return array
	public int[] getArray() {

		return new int[] { 10, 20, 30, 40, 50, 60 };
	}

	public static void main(String[] args) {
		// calling method by creating object
		ReturingArrayFromMethod arrayFromMethod = new ReturingArrayFromMethod();
		int arr[] = arrayFromMethod.getArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]+ " ");
		}
	}        
}
