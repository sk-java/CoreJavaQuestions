package com.sk.array_d3;

import java.util.Arrays;

public class RotateArray {

	static int[] rotate(int[] arr, int k) {

		int n = arr.length;
		k = k % n;
		int ans[] = new int[n];
		int j = 0;

		for (int i = n - k; i < n; i++) {
			ans[j++] = arr[i];
		}

		for (int i = 0; i < n - k; i++) {
			ans[j++] = arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;

		System.out.println("Array before rotation : " + Arrays.toString(arr));
		int[] ans = rotate(arr, k);
		System.out.println("Array after " + k + " rotation: " + Arrays.toString(ans));
	}

}
