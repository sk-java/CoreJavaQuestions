package com.sk.array_d1;

public class SortedOrNot {

	// array sorted or not
	static boolean isSorted(int arr[]) {
		boolean check = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Is the given array sorted: " + isSorted(arr));
	}

}
