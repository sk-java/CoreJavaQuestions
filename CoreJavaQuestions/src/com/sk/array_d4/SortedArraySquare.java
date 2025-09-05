package com.sk.array_d4;

import java.util.Arrays;

//Given an integer array 'a' sorted in non-decreasing order, return an array 
//of the squares of each number sorted in non-decreasing order.

public class SortedArraySquare {

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int[] sortSquares(int arr[]) {
		int n = arr.length;
		int i = 0, j = n - 1;
		int ans[] = new int[n];
		int k = n - 1;

		while (i <= j) {
			if (Math.abs(arr[i]) > Math.abs(arr[j])) {
				ans[k--] = arr[i] * arr[i];
				i++;
			} else {
				ans[k--] = arr[j] * arr[j];
				j--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int arr[] = { -10, -3, -2, 1, 4, 5 };
		int[] ans = sortSquares(arr);
		System.out.println(Arrays.toString(ans));
	}

}
