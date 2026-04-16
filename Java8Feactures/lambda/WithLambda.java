package com.Java8Feactures.lambda;

public class WithLambda {
 public static void main(String[] args) {
	int width = 10;
	
	//with lambda expression
	Drawable d2=()->{
		System.out.println("Drawing"+" "+width);
	};
	d2.draw();
}
}
