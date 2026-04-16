package com.synchronization;

public class TestSynchronization {
	public static void main(String args[]) {
		Test obj = new Test();// only one object
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}
