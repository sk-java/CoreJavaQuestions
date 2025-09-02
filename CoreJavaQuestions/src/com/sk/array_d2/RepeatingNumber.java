package com.sk.array_d2;

//Given an array 'arr' consisting of integers. Return the first value that is repeating in this array. 
//If no value is being repeated, return -1.

public class RepeatingNumber {

	static int firstRepeatingNumber(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 5, 3, 4, 6, 3, 4, };
		System.out.println("First Repeating Number: " + firstRepeatingNumber(arr));

	}
}
