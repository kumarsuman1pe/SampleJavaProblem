package com.rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringAndBuffer {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		//list.add("Suman");

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer a = itr.next();

			System.out.println(a);

		}

	}

}
