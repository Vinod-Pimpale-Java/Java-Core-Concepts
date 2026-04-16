package com.collections.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListUserValues {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter 5 mobile numbers>>>");
			Scanner sc = new Scanner(System.in);
			String mobileNumber = sc.next();
			list.add(mobileNumber);
		}
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println();
		}
	}
}
