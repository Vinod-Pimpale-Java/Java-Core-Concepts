package com.Multithreading.methods;

//The getPriority() method of thread class is used to check the priority of the thread.
//Priority of thread can either be assigned by the JVM or by the programmer explicitly while creating the thread.
//The thread's priority is in the range of 1 to 10. The default priority of a thread is 5
public class GetPriorityMethod extends Thread {
	public void run() {
		System.out.println("Running name is>>>" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
	
		} 
		
	}
		
	

	public static void main(String[] args) {
		// Creating two threads
		GetPriorityMethod t1 = new GetPriorityMethod();
		GetPriorityMethod t2 = new GetPriorityMethod();
		// printing the default thread priorities
		System.out.println("t1 thread priority is>>>" + t1.getPriority());
		System.out.println("t2 thread priority is>>>" + t2.getPriority());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();

	}
}
