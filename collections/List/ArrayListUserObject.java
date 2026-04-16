package com.collections.List;
import java.util.ArrayList;
import java.util.Iterator;

//User-defined class objects in Java ArrayList
public class ArrayListUserObject {
	public static void main(String[] args) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Piyush", 30);
		Student s2 = new Student(103, "Ashwini", 25);
		Student s3 = new Student(104, "Anushree", 26);
		Student s4 = new Student(105, "Amol", 27);
		// Creating Arraylist of student
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1); // adding Student class object
		list.add(s2);
		list.add(s3);
		list.add(s4);
		// Getting Iterator
		Iterator<Student> itr = list.iterator();
//traversing elements of ArrayList object  
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.id + " " + st.Name + " " + st.age);
		}

	}
}
