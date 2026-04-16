package com.collections.List;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;

//Design the method to return the list of Employees in ArrayList and print it

public class ArrayListInList {
	public List<Employees> getStudentList() {
		List<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(101, "Raj", "Gaikwad", "Mumbai"));
		list.add(new Employees(101, "Piyush", "Gaikwad", "Pune"));
		list.add(new Employees(101, "Yogita", "Kolate", "Saswad"));
		list.add(new Employees(101, "Supriya", "Shinde", "Moshi"));
		return list;

	}

	public static void main(String[] args) {
		ArrayListInList al = new ArrayListInList();
		System.out.println(al.getStudentList());
	}
}
