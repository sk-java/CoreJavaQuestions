package com.sk.array_d4;

import java.util.Arrays;

// Sort an array consisting of 0s and 1s

public class SortArray {

	static void sortZerosAndOnes(int[] arr) {
		int zeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeros++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i < zeros) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
	}

	static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	// Two pointer approach
	static void sortsortZerosAndOnesTwoPointer(int arr[]) {
		int n = arr.length;
		int left = 0, right = n - 1;
		
		while (left < right) {
			if (arr[left] == 1 && arr[right] == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if (arr[left] == 0) {
				left++;
			}
			if (arr[right] == 1) {
				right--;
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 0, 1, 1, 0, 0, 1 };
//		sortZerosAndOnes(arr);
//		System.out.println(Arrays.toString(arr));

		sortsortZerosAndOnesTwoPointer(arr);
		System.out.println(Arrays.toString(arr));

	}
}