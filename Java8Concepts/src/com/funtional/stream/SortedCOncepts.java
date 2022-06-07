package com.funtional.stream;

import java.util.List;

public class SortedCOncepts {
	public static void main(String[] args) {
		List<Integer> list = List.of(12, 11, 10, 01, 33, 55, 11);
		list.stream().sorted().forEach(System.out::println);
		System.out.println("Distinct values ");
		list.stream().distinct().sorted().forEach(System.out::println);

	}
}
