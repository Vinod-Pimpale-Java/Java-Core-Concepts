package com.synchronization;

public class Thread2 extends Thread {
	Test t;

	Thread2(Test t) {
		this.t = t;
	}

	public void run() {
		t.printTest(100);
	}
}
