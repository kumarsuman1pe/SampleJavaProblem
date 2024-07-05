package com.funtional.stream;

import java.util.List;

public class Processing {

	public static void main(String[] args) {
		List<Integer> list = List.of(3, 1, 22, 33, 6, 55);
		// count processor
		long count = countNumberOfElement(list);
		System.out.println("Number of Element: " + count);
		// find first
		System.out.println("First ele: " + findFirstEle(list));

		System.out.println("Second largest ele: " + findSecondLargetEle(list));
		System.out.println("3rd heighest ele: " + findThirdLargetEle(list));

		System.out.println("Find minnium ele: " + findMinniumEle(list));
		System.out.println("Find maximum ele: " + findMaxEle(list));

	}

	private static int findMaxEle(List<Integer> list) {
		return list.stream().max((a, b) -> a.compareTo(b)).get();
	}

	private static int findMinniumEle(List<Integer> list) {
		return list.stream().min((a, b) -> a.compareTo(b)).get();
	}

	private static int findThirdLargetEle(List<Integer> list) {
		return list.stream().sorted((a, b) -> -a.compareTo(b)).skip(2).findFirst().get();
	}

	private static int findSecondLargetEle(List<Integer> list) {
		return list.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().get();
	}

	private static int findFirstEle(List<Integer> list) {

		return list.stream().findFirst().get();
	}

	private static Long countNumberOfElement(List<Integer> list) {
		return list.stream().count();
	}

}
