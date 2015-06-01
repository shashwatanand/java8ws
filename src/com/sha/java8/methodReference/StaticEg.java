package com.sha.java8.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sha.java8.model.Student;

public class StaticEg {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(60, "Shashwat"));
		students.add(new Student(20, "Manish"));
		students.add(new Student(80, "Sumit"));
		students.add(new Student(40, "Santosh"));
		
		Collections.sort(students, Student :: compareIds);
		students.forEach(student -> System.out.println(student));
	}

}
