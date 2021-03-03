package com.comparable;

public class Student implements Comparable<Student> {
	private int usn;
	private String name;

	public Student(int usn, String name) {
		this.usn = usn;
		this.name = name;
	}

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return (this.usn - o.usn);
	}

}
