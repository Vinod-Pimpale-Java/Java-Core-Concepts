package com.synchronization;

public class Thread1 extends Thread {
	Test t;

	Thread1(Test t) {
		this.t = t;
	}

	public void run() {
		t.printTest(5);
	}

}
