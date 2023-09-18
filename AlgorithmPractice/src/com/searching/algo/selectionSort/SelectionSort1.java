package com.searching.algo.selectionSort;
/***
 * Selection sort
 * 
 * @author sumankumar
 *
 */
public class SelectionSort1 {

	public static void main(String[] args) {
		int unsortedArray[] = { 1, 2, 5, 3, 4, 8,1,19,11,5 ,-11};
		System.out.println("Before sorting.....!");
		printArray(unsortedArray);
		int sortedArray[] = selectionSort(unsortedArray);
		System.out.println("After sorting.....!");
		printArray(sortedArray);
	}

	private static void printArray(int[] array) {

		for (int i : array) {
			System.out.print(" " + i);
		}
		System.out.println();
	}

	private static int[] selectionSort(int[] unsortedArray) {
		int length = unsortedArray.length - 1;
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			for (int j = i; j <= length; j++) {
				if (unsortedArray[minIndex] > unsortedArray[j]) {

					minIndex = j;
				}
				
			}
			swap(unsortedArray, i, minIndex);
		}
		return unsortedArray;
	}

	private static void swap(int[] unsortedArray, int i, int j) {
		int temp = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = temp;

	}

}
