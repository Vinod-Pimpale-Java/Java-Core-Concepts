package com.Java8Feactures.methodreference;

public class ConstructorReference {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getmessage("Hello ");
	}
}
