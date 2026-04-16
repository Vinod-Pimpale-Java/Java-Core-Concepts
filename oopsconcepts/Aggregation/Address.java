package com.oopsconcepts.Aggregation;

public class Address {
	private String streetNo;
	private String city;
	private String state;
	private String country;

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
