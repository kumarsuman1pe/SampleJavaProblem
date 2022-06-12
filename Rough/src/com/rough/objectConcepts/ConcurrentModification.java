package com.rough.objectConcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ConcurrentModification {

	public static void main(String[] args) {

		ConcurrentModification c = new ConcurrentModification();
		// toString(),Hashcode(),equals(),finalize(),clone(),
		// getClass(),
		// notify(),notifyAll(),wait(),wait(arg),wait(arg1,arg2)
		Student s = new Student(101, "Abhishek");
		Student s1 = new Student(102, "Dhananjay");
		Student s2 = s;
		
		boolean isEqual = s.equals(s1);
	//	System.out.println(isEqual);

//System.out.println(s.toString());

//		System.out.println("Hashcode "+ student.hashCode());
//		System.out.println("Hashcode "+ student1.hashCode());

		
		
	
		Object obj=new Object();
		
		Method[] methods = obj.getClass().getMethods();
		int counter=0;
		for(Method eachMethod:methods)
		{
			counter++;
			//System.out.println(eachMethod);
		}
		
		//System.out.println("Total number of methods in Object class "+counter);
		
		
		Constructor<?>[] declaredConstructors = obj.getClass().getDeclaredConstructors();
		int counter1=0;
		for(Constructor<?> eachdeclaredConstructors:declaredConstructors)
		{
			counter1++;
			System.out.println(eachdeclaredConstructors);
		}
		
		System.out.println("Total number of Constructors in Object class "+counter1);
		
	}
	

}
