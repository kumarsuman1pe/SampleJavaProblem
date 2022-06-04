package com.exaple;

import java.util.Comparator;

public class MyComparatort implements Comparator<Integer>{

	@Override
	public int compare(Integer int1, Integer int2) {
		return -(int1.compareTo(int2));
	}
//122.comaprTo(1);-->+
}
