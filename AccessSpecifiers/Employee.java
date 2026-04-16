package com.AccessSpecifiers;
//Note: In public Here we can call any method outside package
public class Employee {
	public int num =10;
 public void addOperation() {
	 System.out.println("This is Addition");
 }
 public void editOperation() {
	 System.out.println("This is edit");
 }
 public void deleteOPeration() {
	 System.out.println("This is delete");
 }
 private void removeOperation() {
	 System.out.println(" this is remove Operation");
 }
 public void getEmployeeData() {
	 addOperation();
	 editOperation();
	 deleteOPeration();
	 removeOperation();// private can access within same class

 }
	public void show() {
		System.out.println("Public Access Specifier");
	}
 public static void main(String[] args) {

	 Employee emp = new Employee();
	 emp.addOperation();
	 emp.editOperation();
	 emp.deleteOPeration();
	 emp.removeOperation();

}
}
