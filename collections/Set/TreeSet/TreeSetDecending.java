package com.collections.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

//Let's see an example of traversing elements in descending order.
public class TreeSetDecending {
	public static void main(String args[]){  
		 TreeSet<String> set=new TreeSet<String>();  
		         set.add("Ravi");  
		         set.add("Vijay");  
		         set.add("Ajay");  
		         System.out.println("Traversing element through Iterator in descending order");  
		         Iterator<String> i=set.descendingIterator();  
		         while(i.hasNext())  
		         {  
		             System.out.println(i.next());  
		         }  
		           
		 }  
}
