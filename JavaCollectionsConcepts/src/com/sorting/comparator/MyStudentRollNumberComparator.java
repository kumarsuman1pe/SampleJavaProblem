package com.sorting.comparator;

import java.util.Comparator;

import com.sorting.comparable.Student;

public class MyStudentRollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1,Student s2)
	{
		//return ((Integer)s1.getRoll()).compareTo((Integer)s2.getRoll());
	Integer roll1=s1.getRoll();
	Integer roll2=s2.getRoll();
	// Increasing order of roll number	
	//return roll1.compareTo(roll2);
	
	// Decreasing order of roll number	
	//return roll2.compareTo(roll1);
	return -roll1.compareTo(roll2);

	}
}
