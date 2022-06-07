package com.funtional.stream;

import java.util.List;

public class ReduceConcepts {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 9, 13, 4, 6,2,4,12,15);

		int sum = sum(list);
		System.out.println(sum);
		// square and sum #method 1
		int sqAndAdd=sqAndAdd(list);
		System.out.println(sqAndAdd);
		
		// square and sum #method 2
				int sqAndAdd2=sqAndAdd2(list);
				System.out.println(sqAndAdd2);
			
	}

	private static int sqAndAdd2(List<Integer> list) {
		return list.stream().map(x->x*x).reduce(0, (x,y)->x+y);
	}

	private static int sqAndAdd(List<Integer> list) {
		
		return list.stream().reduce(0, (x,y)->x+y*y);
	}

	private static int sum(List<Integer> list) {
		return list.stream().reduce(1, ((x, y) -> x * y));
	}// 0,12... 12,21

}
