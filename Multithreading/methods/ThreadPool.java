package com.Multithreading.methods;

//Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.
public class ThreadPool implements Runnable {
	private String message;

	public ThreadPool(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();// call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name

	}

	private void processmessage() {
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
