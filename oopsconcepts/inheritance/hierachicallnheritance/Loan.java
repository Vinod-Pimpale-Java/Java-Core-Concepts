package com.oopsconcepts.inheritance.hierachicallnheritance;

public class Loan {
	protected String loanId;
	protected String name;
	
	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String string) {
		this.loanId = string;
	}

	public String getName() {
		return name;
	}

	public Loan(String loanId, String name) {
		super();
		this.loanId = loanId;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void getLoanDetails() {
		Loan loan = new  Loan(loanId, name);
		loan.setLoanId("1010");
		loan.setLoanId("Rakesh");
		System.out.println("Loan Details");
	}
}
