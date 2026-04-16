package com.Multithreading.methods;
//The stop() method of thread class terminates the thread execution. Once a thread is stopped, it cannot be restarted by start() method.
public class StopThread extends Thread {
public void run() {
	for(int i=0;i<=5;i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
public static void main(String[] args) {
	//creating threads
	StopThread t1= new StopThread();
	StopThread t2= new StopThread();
	StopThread t3= new StopThread();
	StopThread t4= new StopThread();
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	System.out.println("thread t3 is stoped");
	
}
}