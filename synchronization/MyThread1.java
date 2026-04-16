package com.synchronization;

public class MyThread1 extends Thread {
	Table2 t;  
	MyThread1(Table2 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
}
