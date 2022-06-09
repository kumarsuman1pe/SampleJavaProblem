package com.funtional.stream;

public class Student {
	public int id;
	String name;
	public int getid() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		boolean isEqual = false;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.id == s.id && this.name.equalsIgnoreCase(s.name)) {
				isEqual = true;
			}
		}
		return isEqual;
	}
}
