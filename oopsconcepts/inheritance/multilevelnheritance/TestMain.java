package com.oopsconcepts.inheritance.multilevelnheritance;

public class TestMain {
public static void main(String[] args) {
	CurrentAccount currentAccount= new CurrentAccount();
	currentAccount.getCurrentAccountDetails();
	currentAccount.getAccountDetails();
	currentAccount.getSavingAccountDetails();

}
}
