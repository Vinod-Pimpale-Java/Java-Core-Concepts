package com.Multithreading;

//Creating thread using Interface impliments class by Runnable Interface
//If our class is already extending another class don't use extend keyword it will avoid multiple interface
//Here in interface method we have create object of theread expicitely we don't use class object
// here we pass object of class into thread object.
public class CreateThreadByInterface implements Runnable {
	public static void main(String[] args) {
		CreateThreadByInterface thread = new CreateThreadByInterface();
		Thread t = new Thread(thread);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}

	}

}
