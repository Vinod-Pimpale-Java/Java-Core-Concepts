package com.Loopingstatements;
//Note: Do while Loop is used if we want to execute loop least ones before checking condition

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("Value of i is>>>" + i);
			i++;
		} while (i <= 10);
		int j = 10;
		do {
			System.out.println("value of j is>>>" + j);
			j--;
		} while (j > 0);
	}

}
