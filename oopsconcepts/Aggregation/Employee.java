package com.oopsconcepts.Aggregation;
//Note:- It has entity reference it is know as aggregation
public class Employee {
private int id;
private String firstName;
private String lastName;
private String mobileNumber;
private Address address; // here is entity refrence given of address class
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
			+ mobileNumber + ", address=" + address + "]";
}

}
