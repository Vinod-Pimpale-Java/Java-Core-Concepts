package com.Multithreading.methods;

//The join() method of thread class waits for a thread to die. 
// It is used when you want one thread to wait for completion of another. 
//This process is like a relay race where the second runner waits until the first runner comes and hand over the flag to him.
public class JoinMethod extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// creating three threads
		JoinMethod thread1 = new JoinMethod();
		JoinMethod thread2 = new JoinMethod();
		JoinMethod thread3 = new JoinMethod();

		// thread1 starts
		thread1.start();
		// starts second thread when first thread t1 is died.
		try {
			thread2.join();
		} catch (InterruptedException e) 
			// start t2 and t3 thread
			{System.out.println(e);}    ;
			// thread2 and thread3 starts
			thread2.start();
			thread3.start();
		}

	}


