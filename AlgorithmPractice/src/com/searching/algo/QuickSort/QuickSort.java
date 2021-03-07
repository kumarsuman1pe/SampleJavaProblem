package com.searching.algo.QuickSort;

public class QuickSort {

	public static void main(String[] args) {
		Integer list[] = { 4, 5, 1, 2, 3 ,3,1};
		quickSort(list, 0, list.length - 1);
		for (int e : list) {
			System.out.print(e + " ");
		}
	}

	private static void quickSort(Integer[] list, int i, int j) {

		if (i >= j) {
			return;
		}

		if (i < j) {
			int location = partition(list, i, j);
			quickSort(list, i, location - 1);
			quickSort(list, location + 1, j);

		}

	}

	private static int partition(Integer[] list, int low, int high) {

		int i = low, j = high;
		int pivot = list[low];
		while (i < j) {
			while (pivot >= list[i]) {
				i++;

			}
			while (pivot < list[j]) {
				j--;
			}
			if (i < j) {
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		int temp = list[j];
		list[j] = list[low];
		list[low] = temp;
		return j;
	}

}
