package com.Multithreading.methods;

// Syntax public static Thread currentThread()  
public class CurrentThreadMethod extends Thread {
	public void run() {
		// print currently executing thread
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// This will create two thread
		CurrentThreadMethod thread1 = new CurrentThreadMethod();
		CurrentThreadMethod thread2 = new CurrentThreadMethod();
		CurrentThreadMethod thread3 = new CurrentThreadMethod();
		CurrentThreadMethod thread4 = new CurrentThreadMethod();
		CurrentThreadMethod thread5 = new CurrentThreadMethod();

		// this will call the run() method
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

	}
}
