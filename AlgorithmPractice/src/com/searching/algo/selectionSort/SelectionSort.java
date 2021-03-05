package com.searching.algo.selectionSort;

public class SelectionSort {
	public static void main(String[] args) {
		int list[] = { 2, 1, 4, 5, 3,11, -11 };
		int[] sortedList = selectionSort(list);

		for (Integer ele : sortedList) {
			System.out.print(ele + " ");
		}
	}

	private static int[] selectionSort(int[] list) {
		int length = list.length;

		for (int i = 0; i <length ; i++) {
			int minIndex = i;
			for (int j = i + 1; j <length; j++) {
				if (list[j] < list[minIndex]) {
					minIndex = j;
				}

			}
			int temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
		return list;
	}
}
