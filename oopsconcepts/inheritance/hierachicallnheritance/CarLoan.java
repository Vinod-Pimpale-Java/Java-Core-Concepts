package com.oopsconcepts.inheritance.hierachicallnheritance;

public class CarLoan extends Loan {

	public CarLoan(String loanId, String name) {
		super(loanId, name);
		
	}
	void getCarLoanDetails() {
		System.out.println("THis are Care Loan Deatils");
	}

}
