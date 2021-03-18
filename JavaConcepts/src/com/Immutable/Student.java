package com.Immutable;

public final class Student {
	/*
	 * steps: 
	 * 1. Make class as final so it can not be extended 
	 * 2. Make all fields as private and final :CONSTANT
	 * 3. Don't expose setter method 
	 * 4. Do initialization through constructor 
	 * 5. Exposed method should always create new instance when its modifying the fields 
	 * 6. Do deep coupling in constructor for all mutable
	 * object and getter for mutable objects should return the cloned copy instead
	 * of actual reference
	 */

	private final int usn;
	private final String name;
	private final Date dob;

	public Student(int usn, String name, Date dob) {
		this.usn = usn;
		this.name = name;
		// do deep coupling instead of ->this.dob = dob;
		Date newDob = new Date();
		newDob.setDay(dob.getDay());
		newDob.setMonth(dob.getMonth());
		newDob.setYear(dob.getYear());
		this.dob = newDob;

	}

	public int getUsn() {
		return usn;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		Date clonedate = new Date();
		clonedate.setDay(this.dob.getDay());
		clonedate.setMonth(this.dob.getMonth());
		clonedate.setYear(this.dob.getYear());

		return clonedate;
	}
}
