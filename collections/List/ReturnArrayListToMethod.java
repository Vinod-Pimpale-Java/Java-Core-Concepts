package com.collections.List;
import java.util.ArrayList;

//Design method to return ArrayList to method and print it
public class ReturnArrayListToMethod {
	public ArrayList getEmployeeData() {
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		return list;
	}

	public static void main(String[] args) {
		ReturnArrayListToMethod al = new ReturnArrayListToMethod();
		System.out.println(al.getEmployeeData());
	}
}
