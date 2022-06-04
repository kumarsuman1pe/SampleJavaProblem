package com.exaple;
import java.util.Set;
import java.util.TreeSet;

public class ComparableAndComparator {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(122);
		ts.add(10);
		ts.add(15);
		ts.add(5);
		System.out.println(ts);
		
		MyComparatort myComp=new MyComparatort();
		
		
		Set<Integer> tsCustom = new TreeSet<Integer>(myComp);

		tsCustom.add(1);
		tsCustom.add(122);
		tsCustom.add(10);
		tsCustom.add(15);
		tsCustom.add(5);
		System.out.println(tsCustom);




	}
}
