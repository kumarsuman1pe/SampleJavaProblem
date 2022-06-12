package com.rough.objectConcepts;

public class StudentImmutable {

	/*
	 * 1.make constructor as private so it won't be visible to outside of the world
	 * 
	 * 2.Create soul instance 3.expose method to return the caller soul instance
	 * 4.use ref to verify
	 * 
	 * 
	 * 
	 */
	private StudentImmutable() {

	}

	private static volatile StudentImmutable soulInstance = null;

	public static StudentImmutable getInstance() {
		if (soulInstance == null) {

			synchronized (StudentImmutable.class) {
				if (soulInstance == null) {
					soulInstance = new StudentImmutable();
				}
			}
		}

		return soulInstance;

	}

}
