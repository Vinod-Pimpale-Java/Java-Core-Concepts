package com.oopsconcepts.encapsulation;
//note:- Always keep global variables as privae and access then into other methods this simply called as binding data into single entity as encapsulation.
public class Employee {
	private int id;
	private String name;
	private String city;
	private String salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
  
}
