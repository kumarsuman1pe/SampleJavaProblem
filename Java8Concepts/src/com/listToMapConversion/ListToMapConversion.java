package com.listToMapConversion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {

	public static void main(String[] args) {
		List<Hosting> list = List.of(new Hosting(1, "Suman", 100), new Hosting(2, "Deepak", 200),
				new Hosting(5, "Ashish", 500));
		
		System.out.print("---by using method referencing");
		Map<Integer, String> hostingMap = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		
		
		hostingMap.forEach((x, y) -> {
			System.out.print(x);
			System.out.println(y);
		});
		
		
		System.out.print("---by using lambda expression");

		Map<Integer, String> hostingMap1 = list.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));
		
		
		hostingMap1.forEach((x, y) -> {
			System.out.print(x);
			System.out.println(y);
		});
		
		System.out.println("---Handling duplicate key scenarios..");
		List<Hosting> dupList = List.of(new Hosting(1, "Suman", 100), new Hosting(2, "Deepak", 200),
				new Hosting(1, "Ashish", 500));
		
		
		Map<Integer,String> stuMap=dupList.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName,(x,y)->y));

		stuMap.forEach((x,y)->{
			System.out.print(x);
			System.out.println(y);
		});
	}

}
