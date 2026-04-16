package com.Multithreading.methods;

public class RunTimeClasses {
	public static void main(String args[])throws Exception{  
		//will open a new notepad
		  //Runtime.getRuntime().exec("notepad");
		//Runtime.getRuntime().exec(args);
		
		  // will shutdown windows system
		  // Runtime.getRuntime().exec("shutdown -s -t 0"); 
		
		  //Will restart windows system
		  //Runtime.getRuntime().exec("shutdown -r -t 0");  
		 
		
		  // Will find avaliable processors
		  //System.out.println(Runtime.getRuntime().availableProcessors());
		  
		  //Will find runtime free and total memory
		  Runtime r=Runtime.getRuntime();  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		  System.out.println("Total Memory:"+r.totalMemory());
		  for(int i=0;i<10000;i++){  
			   new RunTimeClasses();  
			  }  
			  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
			  System.gc();  
			  System.out.println("After gc(), Free Memory: "+r.freeMemory()); 
		    
		 }  
}
