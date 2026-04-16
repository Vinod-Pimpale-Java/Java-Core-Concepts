package com.Multithreading.methods;

//The yield() method of thread class pauses the currently executing thread object to temporarily pause
//and allow other threads to execute.
public class YieldMethod extends Thread {
	public void run() {
		for (int i = 0; i <= 3; i++)

			System.out.println("in control>>>" + Thread.currentThread().getName());
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// creating two threads
		YieldMethod t1 = new YieldMethod();
		YieldMethod t2 = new YieldMethod();
		// calling run method
		t1.start();
		t2.start();
		for (int i = 0; i <= 3; i++) {
			// control is given to child thread
			t1.yield();
			System.out.println("in control>>>" + Thread.currentThread().getName());
		}

	}

}
