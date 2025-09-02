package com.sk.array_d1;

public class CountStrictlyGreaterElement {

	// count strictly greater element than x
	static int countStrictlyGreater(int[] arr, int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 1, 3, 5, 6, 4, 3 };
		int x = 4;
		System.out.println(
				"Count number of Element greater than " + x + " in the array is: " + countStrictlyGreater(arr, x));
	}

}
