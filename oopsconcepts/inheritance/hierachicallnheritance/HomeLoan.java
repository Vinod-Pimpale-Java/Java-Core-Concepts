package com.oopsconcepts.inheritance.hierachicallnheritance;

public class HomeLoan extends Loan{
 public HomeLoan(String loanId, String name) {
		super(loanId, name);
		
	}

void getHomeLoanDetails() {
   HomeLoan homeLoan= new  HomeLoan(loanId, name);
   
   System.out.println("This are home loan details");
 }
}
