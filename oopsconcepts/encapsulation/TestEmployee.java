package com.oopsconcepts.encapsulation;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TestEmployee {
	public static void getUserInputs() {
		System.out.println("Enter employeeID>>>");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.println("Enter employee name>>>");
		String name=sc.next();
		System.out.println("Enter employee city>>>");
		String city=sc.next();
		System.out.println("Enter user salary>>>");
	String salary=	sc.next();
		//Setting data into employee
	Employee emp= new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setCity(city);
		emp.setSalary(salary);
		System.out.println("Employee Id is>>>"+emp.getId());
		System.out.println("Employee name is>>>"+emp.getName());
		System.out.println("Employee city is>>>"+emp.getCity());
		System.out.println("Employee salary is>>>"+emp.getSalary());
	}
 public static void main(String[] args) {
	getUserInputs();

}
}
