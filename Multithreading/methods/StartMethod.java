package com.Multithreading.methods;

public class StartMethod extends Thread {
	public void run() {
		System.out.println("Thread is running.......");
	}

	public static void main(String[] args) {
		StartMethod startMethod = new StartMethod();// this is call run method
		startMethod.start(); //this will call start method
	}
}
