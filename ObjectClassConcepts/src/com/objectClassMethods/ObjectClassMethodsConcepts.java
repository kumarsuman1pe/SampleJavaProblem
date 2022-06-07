package com.objectClassMethods;

public class ObjectClassMethodsConcepts {

	public static void main(String[] args) {

		ObjectClassMethodsConcepts c = new ObjectClassMethodsConcepts();
		// toString(),Hashcode(),equals(),finalize(),clone(),getClass(),notify(),notifyAll(),wait(),
		// wait(arg),wait(arg1,arg2)

		Student studunt = new Student(101, "Alex");
		Student student1 = new Student(102, "Jelly");

		System.out.println(studunt.toString());

		System.out.println("Hashcode " + studunt.hashCode());
		System.out.println("Hashcode " + student1.hashCode());
		/***
		 * Equals method
		 */
		Student studunt2 = new Student(101, "Alex");
		Student studunt3 = studunt2;
		
		boolean isEquals = studunt.equals(studunt3);
		System.out.println("Is objects are Equals: " + isEquals);

		/**
		 * finalize() will be called just before the object get destroyed
		 */
		//System.gc();
		
		Student s5=(Student) studunt2.clone();
		System.out.println(s5);
		
	}

}
