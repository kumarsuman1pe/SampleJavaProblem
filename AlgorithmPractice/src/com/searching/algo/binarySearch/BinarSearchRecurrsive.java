package com.searching.algo.binarySearch;

public class BinarSearchRecurrsive {

	public static void main(String[] args) {
		int list[] = { 2, 4, 8, 9, 10, 11, 15 };
		int key = -1;
		int index = binarySearchRecurssion(list, key, 0, list.length-1);
		if (index != -1) {
			System.out.println("Key Found at Index: " + index);
		} else {
			System.out.println("SORRY!! Key Not Found!");
		}

	}

	private static int binarySearchRecurssion(int[] list, int key, int low, int high) {
		int mid;
		if (low <= high ) {
			mid = low + (high-low) / 2;
			if (list[mid] == key) {
				return mid;
			} else if (key < list[mid]) {
				return binarySearchRecurssion(list, key, low, mid - 1);
			} else if (key > list[mid]) {
				return binarySearchRecurssion(list, key, mid + 1, high);
			}
		}
		return -1;
	}

}
