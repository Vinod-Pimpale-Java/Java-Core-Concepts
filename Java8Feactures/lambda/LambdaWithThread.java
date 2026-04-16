package com.Java8Feactures.lambda;
//Passing thread using Runnable interface
public class LambdaWithThread implements Runnable {

	@Override
	public void run() {

		// Passing thread without lambda

	}

	public static void main(String[] args) {
		// Thread Example without lambda
		LambdaWithThread lambdaWithThread = new LambdaWithThread();
		Thread t1 = new Thread(lambdaWithThread);
		t1.start();
		System.out.println("Thread 1 is running.....");
		// Thread Example with lambda

		Runnable r1 = () -> {

			System.out.println("Thread 2 is running.....");

		};
		Thread t2 = new Thread(r1);
		t2.start();
	}
}