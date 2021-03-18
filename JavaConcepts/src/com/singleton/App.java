package com.singleton;
/*
 * STEPS:
 * 1). We can restrict object creation by making constructor as a private
 * 2). Create a soul instance
 * 3). Define a global access point to that soul instance
 * 4). Take extra precaution for shared resource(soul instance) 
 * 5). Verify by reference comparing 
 */


public class App {
	public static void main(String[] args) {
		SingletonTest obj1 = SingletonTest.getSouleInstance();
		System.out.println(obj1.hashCode());

		SingletonTest obj2 = SingletonTest.getSouleInstance();
		System.out.println(obj2.hashCode());
		
		boolean isEqual=(obj1==obj2);
		System.out.println("Are Obj1 and Obj2 EQUALS ?? "+isEqual);
	}
}