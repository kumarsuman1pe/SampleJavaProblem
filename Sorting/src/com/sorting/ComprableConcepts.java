package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ComprableConcepts {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(101, "Prateek"));
		studentList.add(new Student(105, "Deepak"));
		studentList.add(new Student(103, "Sudipta"));
		studentList.add(new Student(110, "Aatul"));
		System.out.println("Student list "+studentList);
		Collections.sort(studentList);
		System.out.println("Student List "+studentList);

		System.out.println("Tree Set concepts......");

		Set<Employee> employeeTreeSet=new TreeSet<Employee>();
		Employee e1= new Employee(111, "Suman");
		employeeTreeSet.add(e1);
		employeeTreeSet.add(new Employee(112, "Arun"));
		
		System.out.println("Employee Tree Set "+employeeTreeSet);

		
	}
	
}
