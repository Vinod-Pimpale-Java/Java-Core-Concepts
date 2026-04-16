package com.Array;
//Use arr.clone() Method
// for single dimensional array it copy actual values and multidimensional it copies reference
//clone() method is used to create a copy of an array.
//It creates a new array object with the same elements.
public class CloanArray {
	public static void main(String args[]){  
		int arr[]={33,3,4,5};  
		System.out.println("Printing original array:");  
		for(int i:arr)  
		System.out.println(i);  
		  
		System.out.println("Printing clone of the array:");  
		int carr[]=arr.clone();  
		for(int i:carr)  
		System.out.println(i);  
		  
		System.out.println("Are both equal?");  
		System.out.println(arr==carr);  
		  
		}}  
