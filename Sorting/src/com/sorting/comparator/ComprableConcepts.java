package com.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ComprableConcepts {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "Prateek"));
		studentList.add(new Student(105, "Deepak"));
		studentList.add(new Student(103, "Sudipta"));
		studentList.add(new Student(110, "Aatul"));
		System.out.println("Student list " + studentList);
		/*
		 * To use the collections sort method the Objects Must be Comparable and here we
		 * made the Student object comparable by implementing the Comparable interface
		 * by Student class and overriding the compareTo(Object obj)
		 */
		Collections.sort(studentList);
		System.out.println("Student List " + studentList);

		System.out.println("Tree Set concepts......");
		/***
		 * TreeSet() empty tree set constructor will give the facility of default
		 * natural sorting order BUT the Object must be Comaparable.. The String class
		 * and all wrapper class is already comparable and if we wanna store the custom
		 * object in tree related DS then we have to make the corresponding class as
		 * comparable by extending the comparable interface and overriding the
		 * compareTo(Object obj) by providing the default sorting def..
		 * 
		 */
		Set<Integer> intTreeSet = new TreeSet<Integer>();
		intTreeSet.add(1);
		intTreeSet.add(21);
		intTreeSet.add(5);
		intTreeSet.add(11);
		System.out.println("Tree Set concepts......" + intTreeSet);

		Set<Employee> employeeTreeSet = new TreeSet<Employee>();
		employeeTreeSet.add(new Employee(111, "Suman"));
		employeeTreeSet.add(new Employee(112, "Arun"));

		System.out.println("Employee Tree Set " + employeeTreeSet);
		/**
		 * if we want to provide the our own sorting logic then we should go for
		 * Comparator check corresponding concepts for more details
		 */
	}

}
