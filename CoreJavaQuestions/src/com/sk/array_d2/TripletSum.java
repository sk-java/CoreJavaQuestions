package com.sk.array_d2;

// Count the number of triplets whose sum is equal to the given value target.

public class TripletSum {

	static int tripletSum(int[] arr, int target) {

		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 6, 3 };
		int target = 12;

		System.out.println(tripletSum(arr, target));
	}
}
