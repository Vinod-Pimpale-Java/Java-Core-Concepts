package com.Multithreading.methods;
//The getId() method is used to return the thread identifier.

//The thread ID is a unique positive number which was generated at the time of thread creation.
//The thread ID remains unchanged during its lifetime. When the thread is terminated, the ID
// of thread can be reused.

public class GetId implements Runnable {

	public void run() {
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		GetId id = new GetId();
		Thread t1 = new Thread(id);
		Thread t2 = new Thread(id);
		Thread t3 = new Thread(id);
		Thread t4 = new Thread(id);

		System.out.println("first thread name is>>>" + t1.getName());
		System.out.println("second thread name  is>>>" + t2.getName());
		System.out.println("thired thread name  is>>>" + t3.getName());
		System.out.println("fourth thread name  is>>>" + t4.getName());
		System.out.println("first thread Id is>>>" + t1.getId());
		System.out.println("second thread Id is>>>" + t2.getId());
		System.out.println("thired thread Id is>>>" + t3.getId());
		System.out.println("fourth thread Id is>>>" + t4.getId());

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
