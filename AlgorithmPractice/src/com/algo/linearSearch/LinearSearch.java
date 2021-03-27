package com.algo.linearSearch;

public class LinearSearch {
	/*
	 * Linear search is a Brute Force technique we scan array and search for the
	 * element Order of 
	 * Linear Search=O(n)
	 * We can improve it by Transposition and move to Front/Head Linear Search
	 */
	public static void main(String[] args) {
		int[] list = new int[] { 10, 11, 32, 44, 55, 66 };
		int key = 1;
		int index = linearSearch(list, key);
		if (index != -1) {
			System.out.println("Element Found At Index : " + index);
		} else {
			System.out.println("Soory!! Key " + key + " Not Found!!");
		}
	}

	private static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
