package com.collections.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetBook {
	public static void main(String[] args) {    
	    Set<SetBook> set=new TreeSet<SetBook>();    
	    //Creating SetBooks    
	    SetBook b1=new SetBook(121,"Let us C","Yashwant Kanetkar","BPB",8);    
	    SetBook b2=new SetBook(233,"Operating System","Galvin","Wiley",6);    
	    SetBook b3=new SetBook(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    //Adding SetBooks to TreeSet    
	    set.add(b1);    
	    set.add(b2);    
	    set.add(b3);    
	    //Traversing TreeSet    
	    for(SetBook b:set){    
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);    
	    }    
	}
}
