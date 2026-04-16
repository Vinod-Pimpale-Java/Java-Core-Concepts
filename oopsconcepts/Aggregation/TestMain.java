package com.oopsconcepts.Aggregation;

import java.util.Scanner;

public class TestMain {
	public void getUserDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee Id>>>");
		int id = scanner.nextInt();
		System.out.println("Enter employee first name>>>");
		String firstName = scanner.next();
		System.out.println("Enter employee last name>>>");
		String lastName = scanner.next();
		System.out.println("Enter Employee mobile number>>>");
		String mobileNumber = scanner.next();

		System.out.println("Enter street no>>>");
		String streetNo = scanner.next();
		System.out.println("Enter city>>>");
		String city = scanner.next();
		System.out.println("Enter state>>>");
		String state = scanner.next();
		System.out.println("Enter country>>>");
		String country = scanner.next();

		// setting values into employee object
		Employee employee = new Employee();
		employee.setId(id);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setMobileNumber(mobileNumber);

		// setting values into address object
		Address address = new Address();
		address.setStreetNo(streetNo);
		address.setCity(city);
		address.setState(state);
		address.setCountry(country);

		// setting address into employee object

		employee.setAddress(address);

		// getting the value from employee object here
		System.out.println("Employee Id is>>>" + employee.getId());
		System.out.println("Employee firstName is>>>" + employee.getFirstName());
		System.out.println("Employee lastName is>>>" + employee.getLastName());
		System.out.println("Employee mobileNumber is>>>" + employee.getMobileNumber());

		// getting the values from address object here
		System.out.println("Employee streetNo is>>>" + address.getStreetNo());
		System.out.println("Employee city is>>>" + address.getCity());
		System.out.println("Employee State is>>>" + address.getState());
		System.out.println("Employee country is>>>" + address.getCountry());

	}

	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		testMain.getUserDetails();
	}
}
