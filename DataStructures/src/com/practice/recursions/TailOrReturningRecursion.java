package com.practice.recursions;

public class TailOrReturningRecursion {
	public static void mian(String[] arg) {
		int n = 5;
		fun(n);
	}

	private static void fun(int n) {

		if (n > 0) {
			fun(n - 1);
			System.out.println(n);
		}
	}
}
