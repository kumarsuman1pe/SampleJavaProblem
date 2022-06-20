package com.rough.objectConcepts;

public class Employee {

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	private final int id;
	private final String name;
	
	
	public Employee modify(int modifiedId, String modifiedName) {

		if(id==modifiedId && name.equals(modifiedName) )
		{
			
			return this;
		}
		else {
			return new Employee(modifiedId, modifiedName);
		}
		
	}

	
	
	
}
