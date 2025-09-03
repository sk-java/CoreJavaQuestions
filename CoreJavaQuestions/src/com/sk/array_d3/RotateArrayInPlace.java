package com.sk.array_d3;

import java.util.Arrays;

public class RotateArrayInPlace {

	static void reverse(int arr[], int i, int j) {

		while (i < j) {
			ReverseArray.swapInArray(arr, i, j);
			i++;
			j--;
		}
	}

	static void rotateInPlace(int arr[], int k) {

		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n - k - 1);
		reverse(arr, n - k, n - 1);
		reverse(arr, 0, n - 1);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 2;

		System.out.println("Array before rotation :" + Arrays.toString(arr));
		rotateInPlace(arr, k);
		System.out.println("Array after " + k + " rotation :" + Arrays.toString(arr));
	}
}
