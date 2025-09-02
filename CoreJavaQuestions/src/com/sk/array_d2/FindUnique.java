package com.sk.array_d2;

// Find the unique number in a given Array where all the elements are being
// repeated twice with one value being unique.

public class FindUnique {

	static int findUnique(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = arr[j] = -1;
				}
			}
		}

		int ans = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 2, 1, 3 };

		int unique = findUnique(arr);
		System.out.println("Unique Element: " + unique);
	}

}
