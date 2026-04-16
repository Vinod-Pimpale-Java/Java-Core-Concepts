package com.operators;
//Note:-Logical And && does not check second condition if first condition is false
public class LogicalOperators {
  public static void main(String[] args) {
	int x=10;
	int y=20;
	int z=30;
	int a=40;
	System.out.println(x>y && y>z); //T && F= F
	System.out.println(x<y && y<z); //T && T= T
//Note:- Logical OR || second condition is checked only if first become false
	 System.out.println(x>y||z>a); //T || T=T
	 System.out.println(x<y||z<a); //T || T=T
	
}
}
