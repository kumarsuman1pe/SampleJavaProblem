package com.generics;

public class GenericsClass {

	public static void main(String[] args) {

		display(new GenericsClass());
	}

	



	public static <X> void display(X t)
	{
		
		System.out.println(t);
	}
}