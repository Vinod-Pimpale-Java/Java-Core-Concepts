package com.Multithreading.methods;

public class MultipleRunMethods extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		MultipleRunMethods run1 = new MultipleRunMethods();
		MultipleRunMethods run2 = new MultipleRunMethods();
		run1.run();
		run2.run();

	}
}
