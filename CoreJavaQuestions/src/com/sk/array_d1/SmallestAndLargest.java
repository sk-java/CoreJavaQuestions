package com.sk.array_d1;

import java.util.Arrays;

public class SmallestAndLargest {

	// smallest and largest element in array
	static int[] smallestAndlargestElement(int[] arr) {
		Arrays.sort(arr);
		int ans[] = { arr[0], arr[arr.length - 1] };
		return ans;
	}

	public static void main(String[] args) {

		int arr[] = { 45, 7, 18, 33, 63, 8, 93, 17 };
		int[] ans = smallestAndlargestElement(arr);
		System.out.println("Smallest: " + ans[0]);
		System.out.println("Largest: " + ans[1]);
	}

}
