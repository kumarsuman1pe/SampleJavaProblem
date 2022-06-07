package com.funtional.stream;

import java.util.List;

public class FunctionalProgramingStreamsConcepts {
	public static void main(String[] args) {

		List<Integer> list = List.of(21, 32, 22, 66, 55);
		System.out.println("calling method printEvenNumber...");

		printEvenNumber(list);

		System.out.println("calling method squaresOfNumber...");

		squaresOfEvenNumber(list);

		List<String> nameList = List.of("Suman", "Kumar", "Singh");
		System.out.println("calling method printNameStartWithS...");
		printNameStartWithS(nameList);
		System.out.println("calling method printNameWhoseLengthIsMoreThan2...");
		printNameWhoseLengthIsMoreThan2(nameList);
	}

	private static void squaresOfEvenNumber(List<Integer> list) {
		list.stream().map(number -> "Square of "+number +" "+ number * number).forEach(System.out::println);
	}

	private static void printNameWhoseLengthIsMoreThan2(List<String> nameList) {
		nameList.stream().filter(name -> name.length() > 2).forEach(System.out::println);
	}

	private static void printEvenNumber(List<Integer> list) {
		list.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}

	private static void printNameStartWithS(List<String> nameList) {
		nameList.stream().filter(name -> name.contains("S")).forEach(System.out::println);
	}
}
