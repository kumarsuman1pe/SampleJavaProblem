package com.rough.objectConcepts;

import java.util.List;

public class Comparator {

public static void main(String[] args) {
	List<Integer> list = List.of(10,2,50,51);
	list.stream().sorted((i,j)->i.compareTo(j)).forEach(System.out::print);;
	//list.forEach((x,y)->{
		
	//});
	
}}
