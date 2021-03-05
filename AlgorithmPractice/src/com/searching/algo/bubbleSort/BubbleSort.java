package com.searching.algo.bubbleSort;

public class BubbleSort {
	public static void main(String[] args) {
		int list[] = { 9, 2, 1, 3, 4, 5 };
		bubbleSortAglo(list);
		for (int ele : list) {
			System.out.print(ele + " ");

		}
	}

	private static void bubbleSortAglo(int[] list) {
		int lenght = list.length;
		for (int i = 0; i < lenght - 1; i++) {
			int flag = 0;
			for (int j = 0; j < lenght - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					flag = 1;
				}

			}
			if (flag == 0)
				break;
		}
	}
}
