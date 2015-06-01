package com.sha.java8.interfaces;

public interface StudentInterface {
	int getId();
	String getName();
	
	default String getStudentInfo() {
		return "Student with name " + getName() + " has id " + getId();
	}
}
