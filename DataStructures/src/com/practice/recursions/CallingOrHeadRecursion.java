package com.practice.recursions;

/***
 * Calling recursion example or Ascending recursion
 * 
 * @author sumankumar
 *
 */
public class CallingOrHeadRecursion {

	public static void main(String[] args) {
		int n = 4;
		fun1(n);
	}

	private static void fun1(int n) {
		// base condition: to terminate the recursion
		if (n > 0)  {
			System.out.println(n);
			fun1(n - 1);

		}
	}

}
