package com.sk.array_d4;

import java.util.Arrays;

//Given an integer array 'a', return the prefix sum/running sum 
//in the same array without creating a new array.

public class PrefixSum {

	static int[] makePrefixSum(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		return arr;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 1, 3, 4, 5 };
		int[] prefixSum = makePrefixSum(arr);
		System.out.println(Arrays.toString(prefixSum));
	}
}
