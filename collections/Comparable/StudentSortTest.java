package com.collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortTest {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Yogita", 25));
		list.add(new Student(102, "Supriya", 25));
		list.add(new Student(101, "Harshada", 25));
		list.add(new Student(105, "Ram", 30));

		Collections.sort(list);
		for (Student st : list)
			System.out.println(st.rollno + " " + st.name + " " + st.age);

	}
}
