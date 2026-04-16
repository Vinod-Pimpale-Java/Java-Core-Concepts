package com.Multithreading.methods;

//he getName() method of thread class is used to return the name of thread.
//The setName() method of thread class is used to change the name of the thread.
public class GetAndSetNameMethod extends Thread {
	public void run() {
		System.out.println("The Thread name is>>>>" + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		// creating thread
		GetAndSetNameMethod thread = new GetAndSetNameMethod();

		System.out.println("Thread Default name is>>>" + thread.getName());
		thread.getPriority();
		System.out.println("Thread default priority is>>>>" + thread.getPriority());
		thread.setName("Vinod Pimpale");

		thread.start();

	}
}
