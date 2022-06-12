package com.generics;

public class GenericConceptPrinter {

	public static void main(String[] args) {
		Printer<Integer> integerPrinter = new Printer<>(15);
		integerPrinter.print();

		Printer<Double> doublePrinter = new Printer<Double>(12.00);
		doublePrinter.print();

		Printer<String> stringPrinter = new Printer<String>("Suman");
		stringPrinter.print();
	}
}