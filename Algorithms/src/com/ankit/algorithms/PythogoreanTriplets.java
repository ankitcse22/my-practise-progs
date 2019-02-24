package com.ankit.algorithms;

import java.util.Arrays;

public class PythogoreanTriplets {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6 };

		if (findTriplets(arr)) {
			System.out.println("Found it!!");
		}
	}

	private static boolean findTriplets(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] * arr[i];
		}

		Arrays.sort(arr);

		for (int i = n - 1; i >= 2; i--) {
//Solution: 1

			for (int j = i - 1; j > 0; j--) {
				System.out.println("Comparing :" + arr[i] + " = " + arr[j] + " + " + arr[j - 1]);
				if (arr[i] == arr[j] + arr[j - 1]) {
					return true;
				}
			}

//Solution: 2

//			int l = 0;
//			int r = i - 1;
//			while (l < r) {
//
//				System.out.println("Comparing :" + arr[i] + " = " + arr[l] + " + " + arr[r]);
//
//				if (arr[l] + arr[r] == arr[i])
//					return true;
//
//				if (arr[l] + arr[r] < arr[i])
//					l++;
//				else
//					r--;
//
//			}

		}
		return false;
	}
}
