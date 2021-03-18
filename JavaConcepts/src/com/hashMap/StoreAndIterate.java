package com.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StoreAndIterate {
	/*
	 * 1. Key can't be duplicate(in case of duplicate the latest value will be stored) 
	 * 2. Values can be duplicate 
	 * 3. Null key-> Single time allowed else(in case of duplicate the latest value will be stored) 
	 * 4. NO ORDER stored in respect of Key & Value
	 */

	public static void main(String[] args) {
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("INDIA", "Delhi");
		capitalMap.put("USA", "Wasignton DC");
		capitalMap.put("PAK", "Isalambad");
		capitalMap.put("JAPAN", "Tokio");
		capitalMap.put(null, "Suman");
		capitalMap.put(null, "Kumar");

		// iterate through keySet
		System.out.println("-------------- Iterating Through KEY SET ---------- ");

		Iterator<String> itr = capitalMap.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("Key---> " + key + " Value ---> " + capitalMap.get(key));
		}
		System.out.println("-------------- Iterating Through ENTRY SET ---------- ");

		// Iterate through EntrySet
		Iterator<Entry<String, String>> itr1 = capitalMap.entrySet().iterator();
		while (itr1.hasNext()) {
			Entry<String, String> entrySet = itr1.next();
			String key = entrySet.getKey();
			String value = entrySet.getValue();

			System.out.println("Key ---> " + " Value --> " + value);

		}
		System.out.println("-------------- Iterating Through LAMDA EXPRESSION ---------- ");

		// Iterate through Lamda Expression
		capitalMap.forEach((k, v) -> System.out.println(" Key --> " + k + " Value -->" + v));

	}

}
