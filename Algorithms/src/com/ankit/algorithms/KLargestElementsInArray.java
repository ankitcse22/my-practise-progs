package com.ankit.algorithms;

public class KLargestElementsInArray {

	public static void main(String[] args) {

		int[] arr = { 21, 1, 2, 31, 4, 5, 6, 20 };
		int k = 3;

		int n = arr.length;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = n - 1; i >= n - k; i--)
			System.out.print(arr[i] + " ");
		System.out.println();

	}
}
