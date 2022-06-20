package com.rough.objectConcepts;

public class ImmutableConcepts {

	public static void main(String[] args) {
		Employee e = new Employee(1,"Suman");

		Employee modify = e.modify(2,"Kumar");
		
		System.out.println(e==modify);
		
		Employee e1 = e.modify(1,"Suman");
		
		System.out.println(e==e1);

	}

}
