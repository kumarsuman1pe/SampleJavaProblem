package com.algo.linearSearch;

import java.util.Arrays;

public class MoveToFrontLinearSearch {
	/*
	 * Transposition is a way to Improve Linear search by moving the found key
	 * element to the first/A[0] position
	 */
	public static void main(String[] args) {
		int[] list = { 12, 11, 32, 55, 5, 10 };
		int key = 5;
		System.out.println("Before Move to Front Linear Search \n" + Arrays.toString(list));
		int index = moveToFrontLinearSearch(list, key);
		if (index != -1) {
			System.out.println("Elemet Found in position :" + index);
		} else {
			System.out.println("Sorry!! key " + key + " Not Found");
		}
		System.out.println("After Move to Front Linear Search \n" + Arrays.toString(list));
	}

	private static int moveToFrontLinearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				swap(list,i);
				return i;
			}
		}
		return -1;
	}

	private static void swap(int[] list, int i) {
		int temp = list[i-1];
		list[i-1] = list[i];
		list[i] = temp;
	}

}
