package com.rough.objectConcepts;

public class Logger {

	private Logger() {

	}

	// private static Logger soleInstance = new Logger();
	private static Logger soleInstance = null;

	public static Logger getSoleInstace() {

		if (soleInstance == null) {
			synchronized (Logger.class) {
				if (soleInstance == null) {
					soleInstance = new Logger();
				}
			}

		}

		return soleInstance;
	}

	public void printHello() {
		System.out.println("Hello ");
	}

}
