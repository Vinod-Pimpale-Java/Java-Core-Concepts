package com.Multithreading.methods;

public class StartMethodByInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running..........");

	}

	public static void main(String[] args) {
		StartMethodByInterface start = new StartMethodByInterface();
		Thread t = new Thread(start);
		t.run();
	}
}
