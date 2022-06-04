package com.exaple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapConcepts {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Suman");
		Employee e2 = new Employee(102, "Dhananjay");
		Employee e3 = new Employee(105, "Aatul");
		
		


		HashMap<Employee, String> localCache = new HashMap<Employee, String>();
		
		
		localCache.put(e1, "He is IT background");
		localCache.put(e2, "He is HR background");
		localCache.put(e3, "He is Account background");

		System.out.println(localCache);

		System.out.println(localCache.get(e1));

		System.out.println(localCache.get(e2));
		System.out.println(localCache.get(e3));

		Employee e4 = new Employee(102, "Dhananjay");

		System.out.println("  "+localCache.get(e4));

	}

}
