package com.Multithreading.methods;

//he setPriority() method of thread class is used to change the thread's priority. 
//Every thread has a priority which is represented by the integer number between 1 to 10.
//public static int MIN_PRIORITY: It is the maximum priority of a thread. The value of it is 1.
//public static int NORM_PRIORITY: It is the normal priority of a thread. The value of it is 5.
//public static int MAX_PRIORITY: It is the minimum priority of a thread. The value of it is 10.
public class SetPriorityMethod extends Thread {
	public void run() {
		System.out.println("Thread priority is>>>" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// creating four threads
		SetPriorityMethod t1 = new SetPriorityMethod();
		SetPriorityMethod t2 = new SetPriorityMethod();
		SetPriorityMethod t3 = new SetPriorityMethod();
		SetPriorityMethod t4 = new SetPriorityMethod();

		// setting MIN_PRIORITY of thread it's value is 1
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("min priority of t1 thread is>>>" + t1.getPriority());
		// calling run method

		t1.start();

		// setting NORM_PRIORITY of thread

		t2.setPriority(Thread.NORM_PRIORITY);

		System.out.println("Norm priority of t2 thread is>>>" + t2.getPriority());
		t2.start();

		// setting MAX_PRIORITY of thread
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Max priority of t3 thread is>>>" + t3.getPriority());

		t3.start();

		// setting CUSTOM_PRIORITY of thread
		t4.setPriority(4);
			System.out.println(" Custom Priority of t4 thread is>>>" + t4.getPriority());
		t4.start();
		

	}
}
