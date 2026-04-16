package com.Multithreading.methods;

public class DestroyedMethod extends Thread {
	DestroyedMethod(String threadName, ThreadGroup tg) {
		super(tg, threadName);
		start();
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " finished executing");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// creating a ThreadGroup
		ThreadGroup g1 = new ThreadGroup("Parent thread");
		// creating a child ThreadGroup for parent ThreadGroup
		ThreadGroup g2 = new ThreadGroup(g1, "child thread");

		// creating a thread
		DestroyedMethod t1 = new DestroyedMethod("Thread-1", g1);

		// creating another thread
		DestroyedMethod t2 = new DestroyedMethod("Thread-2", g1);

		// block until other thread is finished
		t1.join();
		t2.join();

		// destroying child thread
		g2.destroy();
		System.out.println(g2.getName() + " destroyed");

		// destroying parent thread
		g1.destroy();
		System.out.println(g1.getName() + " destroyed");
	}
}
