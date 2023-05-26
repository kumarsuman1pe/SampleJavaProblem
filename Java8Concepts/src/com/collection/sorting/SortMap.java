package com.collection.sorting;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {
		Map<Character, Integer> unsortedMap = Map.of('z', 2, 'b', 12, 'e', 121, 'r', 11, 'a', 101);
		System.out.println(unsortedMap);
		sortMapByKey(unsortedMap);
		sortMapByValue(unsortedMap);
	}

	private static void sortMapByValue(Map<Character, Integer> unsortedMap) {
		
		Map<Character,Integer> sortedMap=unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
		collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(x,y)->x,LinkedHashMap::new));
		System.out.println("Sorting map by using key...");
		System.out.println(sortedMap);
		
	}

	private static void sortMapByKey(Map<Character, Integer> unsortedMap) {
		LinkedHashMap<Character, Integer> sortedMap = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> x, LinkedHashMap::new));

		sortedMap.forEach((x, y) -> {
			System.out.print(x);
			System.out.print(" " + y);
			System.out.println();
		});
	}
}
