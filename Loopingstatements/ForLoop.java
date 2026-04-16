package com.Loopingstatements;
//Note: If number of iteration are known then use for loop where you know condition is going to be false
// Syntax for(initialization; condition; inc/dec){
// Statement;
// }
public class ForLoop {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Value of i is>>>" + i);
		}
		for(int j=10; j>0;j--) {
			System.out.println("Value of j is>>>" + j);
		}
	}
}
