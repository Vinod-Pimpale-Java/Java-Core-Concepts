package com.Java8Feactures.methodreference;

//Runnable interface contains only one abstract method. So,
// we can use it as functional interface.
public class RunnableInstanceMethod {
	public void printMsg() {
		System.out.println("This non-static instance method");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(new RunnableInstanceMethod()::printMsg);
		t2.start();
	}
}
