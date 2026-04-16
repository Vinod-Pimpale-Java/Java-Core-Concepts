package com.test;

public class Add {

	public static void main (String args[]) {
		Shape s= new Circle();
		s.show();
		
		s.display();
	}
	
	
}

  class Shape{
	  
	  public static void show() {
		  System.out.println("This is A");
	  }
	  
	 public void display() {
		 System.out.println("This is Shape");
	 }
	  
  }
  
 class Circle extends Shape{
	  
	  public static void show() {
		  System.out.println("This is B");
	  }
	  
	  public void display() {
			 System.out.println("This is Circle");
		 }

	  
  }
 
 class Rectangle extends Shape{
	  
	  public static void show() {
		  System.out.println("This is B");
	  }
	  
	  public void display() {
			 System.out.println("This is Rectangle");
		 }

	  
 }

