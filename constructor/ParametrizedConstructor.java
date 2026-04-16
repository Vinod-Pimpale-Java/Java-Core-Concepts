package com.constructor;
//Note:-Constructor can we overload but can not be override because we can not write multiple constructors with same arguments
public class ParametrizedConstructor {
	int id;
	String name;
	String city;

	public ParametrizedConstructor(int userId, String UserName, String UserCity) {
		id = userId;
		name = UserName;
		city = UserCity;
		System.out.println("id>>>" + id);
		System.out.println("name>>>" + name);
		System.out.println("city>>>" + city);
	}

public static void main(String[] args) {
	ParametrizedConstructor pa = new ParametrizedConstructor(101, "Vinod", "Pune");
}
}
