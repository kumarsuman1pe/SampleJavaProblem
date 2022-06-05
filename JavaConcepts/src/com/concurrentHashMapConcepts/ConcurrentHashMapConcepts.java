package com.concurrentHashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/***
 * 
 * @author sumankumar 
 * 
 * Example of concurrentHashMap
 */
public class ConcurrentHashMapConcepts {

	public static void main(String[] args) {
		/***
		 * If we try to modify the collection while iterating over it, we get
		 * ConcurrentModificationException
		 * 
		 * What happens if the key value is modified? There won’t be any exception
		 * because the collection is modified but its structure remains the same.
		 */
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Suman", 1);
		hashMap.put("Ashish", 2);
		hashMap.put("Anjali", 5);
		Iterator<String> keySet = hashMap.keySet().iterator();
		while (keySet.hasNext()) {
			String key = keySet.next();
			if (key.equals("Suman")) {
				// If we try to modify the collection while iterating over it, we get
				// ConcurrentModificationException
				hashMap.put(key, 181);
				// What happens if the key value is modified?
				// There won’t be any exception because the collection is modified but its
				// structure remains the same.
				// hashMap.put(key+"Suman", 181);

			}
		}
		System.out.println("Iterating over Hashmap ....");

		System.out.println(hashMap);

		/**
		 * Need of concurrent HashMap:
		 * Java ConcurrentHashMap class is part of the
		 * Concurrency Collection Classes. It’s a hash table implementation, which
		 * supports concurrent retrieval and updates. It’s used in a multi-threaded
		 * environment to avoid ConcurrentModificationException.
		 */

		Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<String, Integer>();
		concurrentHashMap.put("Suman", 1);
		concurrentHashMap.put("Ashish", 2);
		concurrentHashMap.put("Anjali", 5);
		Iterator<String> conHMItr = concurrentHashMap.keySet().iterator();
		while (conHMItr.hasNext()) {
			String key = conHMItr.next();
			if (key.equals("Suman")) {
				concurrentHashMap.put(key + "Suman", 181);
			}
		}
		System.out.println("Iterating over Concurrent Hashmap....");
		System.out.println(concurrentHashMap);
	}
}
