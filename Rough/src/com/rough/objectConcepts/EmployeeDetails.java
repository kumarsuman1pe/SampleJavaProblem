package com.rough.objectConcepts;

public class EmployeeDetails {
	
	private static int empId;
	private String empName;
	
	public EmployeeDetails(int id,String name)
	{
		empId=id;
		empName=name;
		
	}
	
	

	public static void main(String[] args) {
		int x = 10;

		EmployeeDetails r1=new EmployeeDetails(1,"Abc");
		EmployeeDetails r2=new EmployeeDetails(1,"Abc");
		EmployeeDetails r3=new EmployeeDetails(1,"Abc");

		
	}

}
