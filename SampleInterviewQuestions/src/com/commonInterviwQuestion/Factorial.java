package com.commonInterviwQuestion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number!");
		int number = sc.nextInt();
		int fact = factorial(number);
		System.out.println("Factorial of " + number + "is " + fact);

	}

	private static int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}

		return fact;
	}

}
