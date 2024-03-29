package com.Immutable;

/***
 * 
 * @author sumankumar
 *
 * An object is immutable if its state cannot change after construction.
 * Immutable objects don’t expose any way for other objects to modify
 * their state; the object’s fields are initialized only once inside the
 * constructor and never change again.
 */
public class ImmutableClassExample {
	/*
	 * steps:
	 * 1. Make class as final so it can not be extended
	 * 2. Make all fields as private and final
	 * 3. Don't expose setter method
	 * 4. Do initialization through constructor
	 * 5. Exposed method should always create new instance when its modifying the fields
	 * 6. Do deep coupling in constructor for all mutable object and getter for mutable objects should return the cloned copy instead of actual reference 
	 */
	public static void main(String[] agrs) {
		Date dob = new Date();
		dob.setDay(1);
		dob.setMonth(2);
		dob.setYear(1992);
		Student s = new Student(1, "Suman", dob);
		System.out.println("Student age "+ s.getDob().getMonth());
		dob.setMonth(5);
		System.out.println("Student age "+s.getDob().getMonth());
		
		System.out.println("Student year of Admission "+ s.getDob().getYear());
		s.getDob().setYear(1995);
		System.out.println("Student year of Admission  "+s.getDob().getYear());

	}

}
