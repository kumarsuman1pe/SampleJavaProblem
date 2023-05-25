package com.collection.iteration;

import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(1, "Suman", 2, "Deepak", 3, "Arun");
		mapIterationByForEach(map);

		Map<String, Integer> map1 = Map.of("Suman", 1, "Anjali", 2, "Deepak", 5);
		mapIterationByStreamForeach(map1);

	}

	private static void mapIterationByForEach(Map<Integer, String> map) {
		System.out.println("Key " + "Value");
		map.forEach((x, y) -> {
			System.out.print(x);
			System.out.print(" " + y);
			System.out.println();
		});
	}

	public static void mapIterationByStreamForeach(Map<String, Integer> map) {
		map.entrySet().forEach((entry) -> {
			System.out.print(entry.getKey());
			System.out.print(" ");
			System.out.print(entry.getValue() + " ");
		});
	}
}
