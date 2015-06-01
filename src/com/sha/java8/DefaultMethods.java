package com.sha.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.sha.java8.model.Student;

public class DefaultMethods {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(60, "Shashwat"));
		students.add(new Student(20, "Manish"));
		students.add(new Student(80, "Sumit"));
		students.add(new Student(40, "Santosh"));
		
		Predicate<Student> pred = (s) -> s.getId() > 40;
		displayStudent(students, pred);
	}

	private static void displayStudent(List<Student> students,
			Predicate<Student> pred) {
		System.out.println("Students met the criteria are ....");
		students.forEach(s -> {
			if (pred.test(s)) {
				//String output = "Student with name " + s.getName() + " has id " + s.getId();
				System.out.println(s.getStudentInfo() );
			}
		});
	}
}
