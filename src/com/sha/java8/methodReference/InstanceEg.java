package com.sha.java8.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sha.java8.model.Student;

public class InstanceEg {
	public static void main(String[] args) {
		InstanceEg obj = new InstanceEg();
		obj.sortItems();
		
	}
	
	public void sortItems() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(60, "Shashwat"));
		students.add(new Student(20, "Manish"));
		students.add(new Student(80, "Sumit"));
		students.add(new Student(40, "Santosh"));
		
		Collections.sort(students, this :: compareIds);
		students.forEach(student -> System.out.println(student));
	}
	
	public int compareIds(Student s1, Student s2) {
		Integer id1 = s1.getId();
		return id1.compareTo(s2.getId());
	}
}
