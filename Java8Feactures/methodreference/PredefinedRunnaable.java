package com.Java8Feactures.methodreference;

public class PredefinedRunnaable {

	public static void threadStatus() {
		System.out.println("Thread is runnig.......");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(PredefinedRunnaable::threadStatus);
		t2.start();
	}
}
