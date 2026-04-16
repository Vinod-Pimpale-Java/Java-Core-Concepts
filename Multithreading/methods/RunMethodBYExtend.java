package com.Multithreading.methods;

public class RunMethodBYExtend extends Thread {
	public void run() {
		System.out.println("Thread Running........");
	}

	public static void main(String[] args) {
		RunMethodBYExtend methodBYExtend = new RunMethodBYExtend();
		methodBYExtend.run();
	}
}
