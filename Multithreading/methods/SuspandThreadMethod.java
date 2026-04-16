package com.Multithreading.methods;

//The suspend() method of thread class puts the thread from running to waiting state.
public class SuspandThreadMethod extends Thread {
	public void run() {
		for (int i = 0; 1 <= 5; i++) {
			try {
				sleep(500);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
			

			}
			System.out.println(i);
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Creating threads
		SuspandThreadMethod t1 = new SuspandThreadMethod();
		SuspandThreadMethod t2 = new SuspandThreadMethod();
		SuspandThreadMethod t3 = new SuspandThreadMethod();
		SuspandThreadMethod t4 = new SuspandThreadMethod();
		// calling run method
		t1.start();
		t2.start();
		// suspand t2 thread
		t2.suspend();
		t3.start();
		t4.start();

	}
}
