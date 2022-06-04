package com.sorting.comparable;

public class Student implements Comparable<Student> {
	private int roll;
	private String name;

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(student.getName());
	}
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	
}
