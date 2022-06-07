package com.funtional.stream;

import java.util.Comparator;
import java.util.List;

public class ComparatorCOncepts {

	public static void main(String[] args) {
		List<Integer> list = List.of(11, 21, 44, 33, 66, 1, 5);

		sortInCustom(list);

		List<String> stringList = List.of("Suman", "Anjali", "Ashish", "AA", "B");
		sortStringInNatOrder(stringList);
		sortStringInReverseOrder(stringList);

	}

	private static void sortStringInReverseOrder(List<String> stringList) {
		stringList.stream().sorted(Comparator.reverseOrder());
	}

	private static void sortStringInNatOrder(List<String> stringList) {
		stringList.stream().sorted().forEach(System.out::println);
	}

	private static void sortInCustom(List<Integer> intList) {
		intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
