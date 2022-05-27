package com.sorting.comparable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.sorting.comparator.Student;

public class ComparatorConcepts {
	/**
	 * Comparator is meant for Custom sorting; contains two methods: compare(object
	 * obj1 ,Object obj2) & equals()
	 * 
	 * Goal: understand the TreeSet() & TreeSet(Comparator) constructors
	 */
	public static void main(String[] args) {
		Set<Integer> intAscendingTreeSet = new TreeSet<Integer>();
		intAscendingTreeSet.add(12);
		intAscendingTreeSet.add(14);
		intAscendingTreeSet.add(10);
		intAscendingTreeSet.add(1);
		System.out.println("Default Sorting order(Increasing order)......");
		System.out.println(intAscendingTreeSet);

		System.out.println("User defined Sorting order(Decreasing order for Integer )......");
		/***
		 * How can we sort the Integer List in descending order
		 * 
		 * Let see the real use of comparator :)
		 * 
		 */
		Set<Integer> intDescTreeSet = new TreeSet<Integer>(new MyDecsOrderIntComparator());

		intDescTreeSet.add(12);
		intDescTreeSet.add(14);
		intDescTreeSet.add(10);
		intDescTreeSet.add(1);
		System.out.println(intDescTreeSet);

		System.out.println("User defined Sorting order(By Implementing Comparable for Custom Objects )......");

		Set<Student> customTreeSet = new TreeSet<Student>();
		customTreeSet.add(new Student(11, "Suman"));
		customTreeSet.add(new Student(112, "Ashish"));
		customTreeSet.add(new Student(115, "Beli"));
		System.out.println(customTreeSet);

		/***
		 * How do we sort the Custom object by without touching the source code of
		 * Corresponding class. i.e: without altering the compare method of Student
		 * class.
		 * 
		 * Here we are able to store the Custom object(Student) bcz we have made student
		 * object comparable
		 * 
		 * Use the TreeSet(Comparator myComparator) constructor
		 */

		Set<Student> customTreeSetUsingComparator = new TreeSet<Student>(new MyStudentRollNumberComparator());
		customTreeSetUsingComparator.add(new Student(11, "Suman"));
		customTreeSetUsingComparator.add(new Student(112, "Ashish"));
		customTreeSetUsingComparator.add(new Student(115, "Beli"));
		System.out.println(customTreeSetUsingComparator);

	}
}
