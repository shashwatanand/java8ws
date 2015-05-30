package com.sha.java8.eg.methodReference;

import java.util.ArrayList;
import java.util.List;

import com.sha.java8.eg.model.Student;

public class StaticEg {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(20, "Manish"));
		students.add(new Student(40, "Santosh"));
		students.add(new Student(60, "Shashwat"));
		students.add(new Student(80, "Sumit"));
	}

}
