package com.practice.recursion;

public class Factorial {

	public static void main(String[] args) {
		int n = 4;
		int result = fact(n);
		System.out.println(result);
	}

	private static int fact(int n) {
		if (n == 0)
			return 1;
		int smallResult=fact(n-1);
		return n*smallResult;

	}

}
