package com.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePractice {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Suman");
		Student s2 = new Student(100, "Raj");
		// list of Custom objects i'e: Student
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		System.out.println("Student List before Sorting... : ");
		System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println("Student List After Sorting... : ");
		System.out.println(studentList);

		System.out.println("--------------------->");

		// list of Integer object
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(4);
		intList.add(1);
		intList.add(3);

		System.out.println("Integer List before Sorting... : ");
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println("Integer List After Sorting... : ");
		System.out.println(intList);

		System.out.println("--------------------->");
		// list of String object
		List<String> strList = new ArrayList<String>();
		strList.add("Suman");
		strList.add("Ashish");
		strList.add("Deepak");
		strList.add("Arun");
		strList.add("Aditya");

		System.out.println("String List before Sorting... : ");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println("String List After Sorting... : ");
		System.out.println(strList);

	}

}
