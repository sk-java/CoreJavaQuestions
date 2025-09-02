package com.sk.array_d2;

// // Count the number of pairs whose sum is equal to the given value target.

public class PairSum {

	static int pairSum(int[] arr, int target) {

		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 4, 6, 3, 5, 8, 2 };
		int target = 7;

		System.out.println(pairSum(arr, target));
	}

}
