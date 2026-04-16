package com.Multithreading;

//To create Thered using extending Thread Class
public class ThreadMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <20; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadMethod1 threadMethod1 = new ThreadMethod1();
		threadMethod1.start();

	}
}
