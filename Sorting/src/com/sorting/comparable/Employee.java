package com.sorting.comparable;

public class Employee implements Comparable<Employee>{

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}

	private int empID;
	private String empName;

	public Employee(int empId, String empName) {
		this.empID = empId;
		this.empName = empName;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}

}
