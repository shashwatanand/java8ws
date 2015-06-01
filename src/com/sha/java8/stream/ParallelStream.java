package com.sha.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.sha.java8.model.Student;

public class ParallelStream {
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
		/*students.stream()
			.parallel()
			.filter(pred)
			.forEach(s ->  System.out.println(s.getStudentInfo()));*/
		
		students.parallelStream()
			.filter(pred)
			.forEach(s ->  System.out.println(s.getStudentInfo()));
	}
}
