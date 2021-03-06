package com.sha.java8.model;

import java.util.Date;

import com.sha.java8.interfaces.StudentInterface;

public class Student implements StudentInterface {
	private int id;
	private String name;
	private Date joiningDate;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the joiningDate
	 */
	public Date getJoiningDate() {
		return joiningDate;
	}
	/**
	 * @param joiningDate the joiningDate to set
	 */
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Student name is " + this.name;
	}
	
	public static int compareIds(Student s1, Student s2) {
		Integer id1 = s1.getId();
		return id1.compareTo(s2.getId());
	}
}
