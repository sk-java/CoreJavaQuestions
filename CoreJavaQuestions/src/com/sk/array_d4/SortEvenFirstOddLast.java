package com.sk.array_d4;

import java.util.Arrays;

// Given an array of integers 'a', move all the even integers at the
// beginning of the array followed by all the odd integers. The
// relative order of odd or even integers does not matter. Return
// any array that satisfies the condition.

public class SortEvenFirstOddLast {

	static void sortArrayByParity(int arr[]) {

		int n = arr.length;

		int left = 0, right = n - 1;
		while (left < right) {
			if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}

			if (arr[left] % 2 == 0) {
				left++;
			}

			if (arr[right] % 2 == 1) {
				right--;
			}
		}

	}

	static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		sortArrayByParity(arr);
		System.out.println(Arrays.toString(arr));
	}
}
