package com.objectClassMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/***
 * 
 * @author sumankumar
 *
 */
public class GetClassConcepts {
	public static void main(String[] args) {
		Object o = new Object();
		Class c = o.getClass();
		System.out.println("Fully quqlified name: " + c.getName());
		Method[] m = c.getDeclaredMethods();
		int count = 0;
		for (Method eachMethod : m) {
			count++;
			System.out.println("Methods Names: " + eachMethod);

		}
		System.out.println("Total Number of methods defined in Object class is :" + count);
		Constructor[] cons = c.getDeclaredConstructors();
		int constructorCount = 0;
		for (Constructor eachCons : cons) {
			constructorCount++;
			System.out.println("Constructor Name: " + eachCons);
		}
		System.out.println("Total Number of Constructors defined in Object class is :" + constructorCount);
	}
}
