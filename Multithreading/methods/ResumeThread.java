package com.Multithreading.methods;

public class ResumeThread extends Thread {
public void run() {
  for(int i=0;i<=3;i++) {
	  System.out.println(Thread.currentThread().getName());
  }
}
public static void main(String[] args) {
	ResumeThread thread1 = new ResumeThread();
	System.out.println("thread after start");
	thread1.start();

	System.out.println("after resume");
	thread1.resume();
}

                 
}
