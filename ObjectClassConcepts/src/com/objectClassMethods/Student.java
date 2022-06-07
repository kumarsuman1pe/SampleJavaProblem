package com.objectClassMethods;

import java.util.Objects;

public class Student implements Cloneable{

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	private int id;
	private String name;

	public int getId() {
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (obj == null)
			return false;
		if (obj instanceof Student) {
			return this.id == s.id && this.name.equals(s.name);
		} else {
			return false;
		}
	}
	@Override
    protected  Object clone() {
		return this;
	}

}
