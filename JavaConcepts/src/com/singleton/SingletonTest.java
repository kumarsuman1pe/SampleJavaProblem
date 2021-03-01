package com.singleton;

class SingletonTest {

	private SingletonTest() {

	}

	private static SingletonTest soleInstance = null;

	public static SingletonTest getSouleInstance() {
		if (soleInstance == null) {
			synchronized (SingletonTest.class) {
				if (soleInstance == null) {
					soleInstance = new SingletonTest();
				}

			}

		}
		return soleInstance;

	}

}
