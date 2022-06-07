package com.funtional.stream;

import java.util.List;

public class DistinctConcepts {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(12,1,33,44,55,55);
		
		list.stream().distinct().forEach(System.out::println);
	}

}
