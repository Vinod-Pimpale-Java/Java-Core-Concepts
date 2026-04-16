  package com.oopsconcepts.inheritance.simpleinheritance;
//Note:-Here one parent class extend to one child class
public class HealthInsurance extends Insurance{
	public void getHealthInsuranceDetails() {
		
	}
	public static void main(String[] args) {
		

		HealthInsurance health= new HealthInsurance();
		System.out.println("Above are Health Insurance Details");
	
		health.getInsuranceDetails();
		health.getHealthInsuranceDetails();
		
		
	}

 
}
