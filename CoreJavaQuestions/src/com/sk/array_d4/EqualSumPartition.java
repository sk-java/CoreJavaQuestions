package com.sk.array_d4;

import java.util.Scanner;

//Check if we can partition the array into two subarrays with equal sum. More formally, check 
//that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.

public class EqualSumPartition {

	static int findArraySum(int arr[]) {
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		return totalSum;
	}

	static boolean equalSumPartition(int[] arr) {
		int totalSum = findArraySum(arr);
		int prefSum = 0;
		for (int i = 0; i < arr.length; i++) {
			prefSum += arr[i];
			int suffixSum = totalSum - prefSum;
			if (suffixSum == prefSum) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		boolean res = equalSumPartition(arr);

		System.out.println("Equal Partition Sum possible: " + res);
	}
}
