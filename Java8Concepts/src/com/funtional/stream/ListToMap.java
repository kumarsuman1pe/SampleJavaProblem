package com.funtional.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Integer> intList = List.of(12, 21, 22, 45, 55);
		Map<Integer, Integer> collect = convertListMap(intList);

		System.out.println(collect);
		
		List<Student> studentList = List.of(new Student(12, "Suman"),new Student(11, "Kumar"));
		Map<Integer, String> studentMap =populateStudentMap(studentList);
		System.out.println(studentMap);
	
	}

	private static Map<Integer, String> populateStudentMap(List<Student> studentList) {
		Map<Integer, String> collect = studentList.stream().collect(Collectors.toMap(Student::getid, Student::getName));
		
		return collect;
	}

	private static Map<Integer, Integer> convertListMap(List<Integer> intList) {
		Map<Integer, Integer> collect = intList.stream().collect(Collectors.toMap(x -> x, x -> x * x));
		return collect;
	}
}
