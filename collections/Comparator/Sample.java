package com.collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//In this class, we are printing the values of the object by sorting on
//the basis of name and age and city.
public class Sample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student(101, "Yogita", 28, "Mumbai"));
        al.add(new Student(102, "Raj", 27, "Nashik"));
		al.add(new Student(103, "Supriya", 24, "Aurnagabad"));
		al.add(new Student(104, "Piyush", 30, "Indor"));
		al.add(new Student(105, "Vinod", 25, "Osmanabad"));
		
		

		System.out.println("Sorting by age>>>");
		Collections.sort(al, new AgeComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollnoe + " " + st.name + " " + st.age + " " + st.city);
		}
			System.out.println("Sorting by Name>>>");

			Collections.sort(al, new NameComparator());

			Iterator itr2 = al.iterator();
			while (itr2.hasNext()) {
				Student st2 = (Student) itr2.next();
				System.out.println(st2.rollnoe + " " + st2.name + " " + st2.age + " " + st2.city);
			}
				System.out.println("Sorting using city>>>");
				Collections.sort(al, new CityComparator());
				Iterator itr3 = al.iterator();
				while (itr3.hasNext()) {
					Student st3 = (Student) itr3.next();
					System.out.println(st3.rollnoe + " " + st3.name + " " + st3.age + " " + st3.city);
				}

			}
		}
	

