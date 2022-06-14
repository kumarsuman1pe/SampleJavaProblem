package com.generics;

public class GenericMethods {
	public static void main(String[] args) {
		display(new GenericMethods());
		display("Suman");
	}

	public static <X> void display(X t) {
		System.out.println(t);
	}
}