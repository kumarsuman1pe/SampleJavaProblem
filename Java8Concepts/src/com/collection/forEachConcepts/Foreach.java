package com.collection.forEachConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Foreach {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("Suman", 1, "Ashish", 2, "Deepak", 4);

		loopMap1(map);
		loopMap2(map);
		List<Integer> list = List.of(1, 2, 3, 4, 5, 22);
		loopList(list);
		loopList1(list);
		
		 List<String> l1 = new ArrayList<>();
	      l1.add("A");
	      l1.add("B");
	      l1.add(null);
	      l1.add("D");
	      l1.add("E");
	      filterNull(l1);
	      

	}

	private static void filterNull(List<String> l1) {
l1.stream().filter(Objects::nonNull).forEach(x->System.out.println(x));		
	}

	private static void loopList1(List<Integer> list) {
		System.out.println("Iterating list with method referencing..");
		list.forEach(System.out::println);
	}

	private static void loopList(List<Integer> list) {
		System.out.println("Iterating list..");
		list.forEach(x -> System.out.println(x));
	}

	private static void loopMap2(Map<String, Integer> map) {
		System.out.println("Iterating map with entrySet..");
		map.entrySet().forEach(x -> {
			System.out.print(x.getKey());
			System.out.println(x.getValue());

		});
	}

	private static void loopMap1(Map<String, Integer> map) {
		System.out.println("Iterating map with forEacH..");
		map.forEach((x, y) -> {
			System.out.println(x+" "+y);

		});
	}

}
