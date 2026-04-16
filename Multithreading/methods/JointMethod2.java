package com.Multithreading.methods;
//It works as relay race pass other thread when first thread ends
public class JointMethod2 extends Thread {
	public void run() {
		for (int i = 0; i <= 4; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// creating threads
		JointMethod2 thread1 = new JointMethod2();
		JointMethod2 thread2 = new JointMethod2();
		JointMethod2 thread3 = new JointMethod2();
		// thread1 starts
		thread1.start();
		try {
			thread1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			// thread12 and thread3 starts
			thread2.start();
			thread3.start();
		}

	}
}
