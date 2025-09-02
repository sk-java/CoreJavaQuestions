package com.sk.array_d1;

public class CountOccurences {

	// count occurrences
	static int countOccurrences(int[] arr, int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 1, 3, 5, 6, 5, 3 };
		int x = 5;
		countOccurrences(arr, x);
		System.out.print(x + " occoured " + countOccurrences(arr, x) + " times in array");
	}

}
