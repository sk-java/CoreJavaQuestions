package com.sk.array_d3;

import java.util.Arrays;

public class ReverseArray {

	static void swapInArray(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void reverseArray(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			swapInArray(arr, i, j);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
