package com.practice.recursions;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 41, 5 };
		System.out.println(checkIfArrayIsSorted(a, a.length-1));
	}

	private static boolean checkIfArrayIsSorted(int[] a, int n) {
		// base case
		if (n == 0 || n == 1) {
			return true;
		}
		// recurssive case

		boolean smallAnswer = checkIfArrayIsSorted(a, n - 1);
		// calculation
		if (!smallAnswer) {
			return false;
		}
		if (a[n - 1] > a[n]) {
			return false;
		}
		return true;
	}

}
