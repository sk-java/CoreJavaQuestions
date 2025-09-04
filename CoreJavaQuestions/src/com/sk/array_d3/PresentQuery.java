package com.sk.array_d3;

import java.util.Arrays;
import java.util.Scanner;

//Given Q queries, check if the given number is present in the array or not.
//Note: Value of all the elements in the array is less than 10 to the power 5.

public class PresentQuery {

	static int[] makeFrequencyArray(int[] arr) {

		int[] freq = new int[100005];
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		return freq;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 89, 16, 56, 21, 58, 67, 82 };

		System.out.println(Arrays.toString(arr));

		System.out.print("Enter number of queries: ");
		int q = sc.nextInt();

		int[] freq = makeFrequencyArray(arr);

		while (q > 0) {
			System.out.print("Enter element to be search: ");
			int x = sc.nextInt();
			if (freq[x] > 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			q--;
		}
	}
}