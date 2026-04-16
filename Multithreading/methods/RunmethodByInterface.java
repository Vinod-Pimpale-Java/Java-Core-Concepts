package com.Multithreading.methods;

public class RunmethodByInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Running.....");

	}

	public static void main(String[] args) {
		RunMethodBYExtend byExtend = new RunMethodBYExtend();
		Thread thread = new Thread(byExtend);
		thread.run();

	}
}
