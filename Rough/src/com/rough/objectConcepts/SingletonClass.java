package com.rough.objectConcepts;

public class SingletonClass {

	public static void main(String[] args) {
		StudentImmutable iStudent = StudentImmutable.getInstance();

		StudentImmutable iStudent1 = StudentImmutable.getInstance();

		boolean isSingleton = iStudent == iStudent1 ? true : false;

		System.out.println(isSingleton);

	}

}
