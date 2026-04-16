package com.Multithreading.methods;

//The isAlive() method of thread class tests if the thread is alive.
//A thread is considered alive when the start() method of thread class has been called and
// the thread is not yet dead.
//This method returns true if the thread is still running and not finished.
public class IsAliveMethod extends Thread {
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("Is run() method is alive ? >>>" + Thread.currentThread().isAlive());
		} catch (InterruptedException e) {

		}

	}

	public static void main(String[] args) {
		IsAliveMethod t1 = new IsAliveMethod();
		System.out.println("befor start method thread is alive ? >>>" + t1.isAlive());
		t1.start();
		System.out.println("after start method thread is alive ? >>>" + t1.isAlive());

	}
}
