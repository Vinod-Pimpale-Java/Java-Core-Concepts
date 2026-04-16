package com.statickeyword;
//Note:static members get loaded into memory at time of class loading i.e.at reading SingleCopy
//but non static members get loaded into memory at time of object creation i.e. new SingCopy()
//Hence static are called as single copy storage
public class SingleCopy {
 int a=5;
 static int b=5;
 public static void main(String[] args) {
	SingleCopy singleCopy1= new SingleCopy();
	System.out.println("Non static"+singleCopy1.a++);
	System.out.println("Static"+singleCopy1.b++);
	SingleCopy singleCopy2= new SingleCopy();
	System.out.println("Non static"+singleCopy2.a++);
	System.out.println("Static"+singleCopy2.b++);
	SingleCopy singleCopy3= new SingleCopy();
	System.out.println("Non static"+singleCopy3.a++);
	System.out.println("Static"+singleCopy3.b++);
	SingleCopy singleCopy4= new SingleCopy();
	System.out.println("Non Static"+singleCopy4.a++);
	System.out.println("Static"+singleCopy4.b++);
}
}
