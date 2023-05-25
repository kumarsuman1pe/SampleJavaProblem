package com.collection.forEachConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListIteration {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 25, 2, 4, 55, 5);

		// default natural order

		list.stream().sorted().forEach(System.out::print);

		list.stream().sorted().forEach(x -> System.out.println(x));
		list.forEach(System.out::print);
		// reverse order
		list.stream().sorted((obj1, obj2) -> obj2.compareTo(obj1)).forEach(ele -> System.out.println(ele));

		// list.sort((obj1,obj2)->obj1.compareTo(obj2));

//		System.out.println("HHkkkk");
//		List<Integer> list1=new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list1.sort((obj1,obj2)->obj1.compareTo(obj2)).;
//		list1.forEach(System.out::print);
//		

		// list.forEach(System.out::println);

		Consumer<String> makeUpperCase = new Consumer<String>() {
			@Override
			public void accept(String t) {
				// More statements if needed
				System.out.println(t.toUpperCase());
			}
		};
		List<String> list2 = Arrays.asList("Alex", "Brian", "Charles");
		list2.forEach(makeUpperCase);

		list2.forEach(ele -> System.out.println(ele.toLowerCase()));

	}

}
