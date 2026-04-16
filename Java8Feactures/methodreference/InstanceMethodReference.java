package com.Java8Feactures.methodreference;

public class InstanceMethodReference {
  public void saySomething() {
	 System.out.println("This is non-static method");
  }
  public static void main(String[] args) {
	  InstanceMethodReference instanceMethodReference= new InstanceMethodReference();
      // Referring non-static method using reference
	 Sayable sayable= instanceMethodReference::saySomething;
	 
	 //calling interface method
	 
	 sayable.say();
	// Referring non-static method using anonymous object  
	 Sayable sayable2 = new  InstanceMethodReference()::saySomething;
	 //calling interface method

	 sayable2.say();
}
}
