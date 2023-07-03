package com.map.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeList {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(105, "Suman", 5));
		empList.add(new Employee(101, "Bikash", 1));
		empList.add(new Employee(111, "Ashish", 2));
		System.out.println("Before sorting.... ");
		System.out.println(empList);

		// sort the employee based on employee properties
		List<Employee> sortedList = empList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());

		System.out.println("Before sorting.... ");
		System.out.println(sortedList);
	}

}

class Employee {
	Integer id;
	String name;
	int depId;

	public Employee(Integer id, String name, int depId) {
		this.id = id;
		this.name = name;
		this.depId = depId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", depId=" + depId + "]";
	}
}
