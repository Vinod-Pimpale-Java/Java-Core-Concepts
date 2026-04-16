package com.string;

import java.util.Scanner;

// Design program to dispay the message as Be Alart covid is back
public class RetrunStringToMethod {
	public static String getMessage(String message) {

		return message;
	}

	public static void main(String[] args) {
		System.out.println("Enter your message here>>>");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String message = scanner.next();
		String s = getMessage(message);
		System.err.println(s);
		System.out.println();

	}
}
