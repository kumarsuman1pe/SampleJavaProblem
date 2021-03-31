package com.practice.arrays;

public class FindMultipleMissingElement {

	public static void main(String[] args) {
		int[] list = { 3, 6, 7, 9, 15 };
		findAllMissingElementFromList(list);
	}

	private static void findAllMissingElementFromList(int[] list) {
		int diff = list[0];
		System.out.println("Missing Elements are!...");
		int missedEle = 0;
		for (int i = 0; i < list.length; i++) {
			if (diff != list[i] - i) {
				missedEle = i + diff;
				while(missedEle<list[i]) {
				System.out.println(missedEle);
				diff++;
				missedEle++;
				}
			}
		}
	}

}
