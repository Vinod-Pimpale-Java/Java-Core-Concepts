package com.Java8Feactures.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FliteringWithStream {
public static void main(String[] args) {
	List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    
    //here we don't need to create new ArrayList
    //hence Stream Store elements and it does not modify original list
    //As only one object is created (productsList)
    //Stream will just convey elements from object (productsList)
    //it will not modify the original list
    List<Float> productPriceList2 = productsList.stream()
    		.filter(p->p.price<30000)//filtering data
    		.map(p->p.price) // fetching price  
    		.collect(Collectors.toList());// collecting as list 
    System.out.println(productPriceList2);
}
}
