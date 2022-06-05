package com.concurrentHashMapConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***
 * @author sumankumar
 * 
 *         This example explains about the concurrent modification exceptions in
 *         java how iterator throw concurrent modification exception..
 * 
 *         FAIL FAST:
 * 
 *         When we try to alter the size/structure of the list at run time while
 *         iterating over the list object we get the the Concurrent modification
 *         exceptions,,
 * 
 * 
 */
public class ConcurrentModificationExcConcepts {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();

		intList.add(21);
		intList.add(10);
		intList.add(11);
		intList.add(21);
		intList.add(31);
		intList.add(41);
		intList.add(51);
		System.out.println(intList);

		Iterator<Integer> itr = intList.iterator();

		while (itr.hasNext()) {
			/***
			 * while altering the Size/Structure of the list here we won't get the exception
			 * immediately we will get the exception immediate after moving the cursor to
			 * the next i.e: itr.next()
			 */

			// itr.next() will move the pointer so use this use carefully

			int temp = itr.next();
			if (temp == 21) {
				System.out.println("Iterating over the list before adding the object to the list!");
				System.out.println(temp);
				intList.add(22);
				System.out.println("Added object into the list!");
			}

		}

	}

}
