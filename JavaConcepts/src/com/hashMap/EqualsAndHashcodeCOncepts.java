package com.hashMap;

import java.util.HashMap;

/*
 * This example explains about the importance of .equals() and hashCode()
 * If we are using Hashing related DS then The object will be great candidate for Key
 * iff the object override the .equals() methods and hashCode() method
 * if its overriding these then we wont get compilation any compilation error 
 * but the program behave strange in some cases.
 */
public class EqualsAndHashcodeCOncepts {

	public static void main(String args[]) {
		Student s1 = new Student(101, "Suman");
		Student s2 = new Student(102, "Ashish");
		Student s3 = new Student(103, "Deepak");
		Student s4 = new Student(104, "Arun");

		HashMap<Student, String> localCache = new HashMap<Student, String>();
		localCache.put(s1, "He is fro IT background ");
		localCache.put(s2, "He is fro IAS background ");
		localCache.put(s3, "He is fro Bank background ");
		localCache.put(s4, "He is fro General background ");

		System.out.println(localCache);
		System.out.println("---------------------");
		Student s = new Student(101, "Suman");
		/*
		 * Without overriding the .equals() and hashCode() you will get the null for
		 * below line
		 */
		System.out.println(localCache.get(s));

	}

}

class Student {
	int usn;
	String name;

	public Student(int usn, String Name) {
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

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + usn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (usn != other.usn)
			return false;
		return true;
	}

}