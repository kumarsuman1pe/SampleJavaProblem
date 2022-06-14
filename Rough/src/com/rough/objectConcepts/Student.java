package com.rough.objectConcepts;
public class Student {

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	int id;
	String name;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return 10;
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
		//
		return isEqual;
	}
}
