package com.map.interview.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValues {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();

		hm.put("A", 105);
		hm.put("B", 101);
		hm.put("C", 100);
		hm.put("D", 111);
		// sort the map with its values using java8
		
	Map<String, Integer> sortedMap = hm.entrySet().stream().sorted((x, y) -> x.getValue().compareTo(y.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (key1, key2) -> key1,
						LinkedHashMap::new));

		System.out.print(sortedMap);

	}

}
