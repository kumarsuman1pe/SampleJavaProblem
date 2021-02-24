package com.searching.algo;

public class BinarySearchIterative {

	public static void main(String[] args) {
		int list[] = { 2, 3, 4, 5, 6, 7, 8, 10 };
		int key = 5;
		int index = binarySearc(list, key);
		if (index != -1) {
			System.out.println("Key Found at Index: " + index);
		} else {
			System.out.println("SORRY!! Key Not Found!");
		}
	}

	private static int binarySearc(int[] list, int key) {

		int low = 0, high = list.length-1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (list[mid] == key) {
				return mid;
			} else if (key < list[mid]) {
				high = mid - 1;
			} else if (key > list[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

}
