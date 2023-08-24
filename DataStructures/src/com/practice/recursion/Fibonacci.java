package com.practice.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		int n=3;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		
		//base case
		if(n==1||n==0)
		{
			return n;
		}
		// recursive
		int smallAnswer1=fib(n-1);
		int smallAnswer2=fib(n-2);
		//calculation
		
		return smallAnswer1+smallAnswer2;
	}

}
