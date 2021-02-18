package com.singleton;

public class App {
	public static void main(String[] args) {
		SingletonTest obj1 = SingletonTest.getSouleInstance();
		System.out.println(obj1.hashCode());

		SingletonTest obj2 = SingletonTest.getSouleInstance();
		System.out.println(obj2.hashCode());
	}
}