package com.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author sumankumar
 *
 */
public class GenericsWithWildCardsExample {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		List<Integer> ls=new ArrayList<>();
		
		List<Integer> intList = List.of(1, 2, 3, 4, 5);
		List<String> stringList = List.of("AA","BB","CC");
		
		callForAnything(intList);

		callForAnything(stringList);
	}
/***
 * to handle any types of List objects
 * @param list
 */
	private static void callForAnything(List<?> list) {
		System.out.println(list);
	}

}
