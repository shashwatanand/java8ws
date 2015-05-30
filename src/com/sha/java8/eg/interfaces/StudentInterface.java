package com.sha.java8.eg.interfaces;

public interface StudentInterface {
	int getId();
	String getName();
	
	default String getStudentInfo() {
		return "Student with name " + getName() + " has id " + getId();
	}
}
