package com.oopsconcepts.polymorphism.methodoverloading;

//Note:-Method overloading is same method name signature with different arguments inside it
public class TestMain {
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public void add(short c, short d) {
		System.out.println(c + d);
	}

	public void add(double e) {
		System.out.println(e);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}

