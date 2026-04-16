package com.collections.List.ArrayList;

public class Employees {
	int empid;
	String FirstName;
	String LastName;
	String City;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Employees(int empid, String firstName, String lastName, String city) {

		this.empid = empid;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.City = city;
	}

	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", City=" + City
				+ "]";
	}

}
