package com.sk.array_d2;

public class FindSecondMaximum {

	static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int findSecondMax(int[] arr) {
		
		int max = findMax(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		int secondMax = findMax(arr);
		return secondMax;
	}

	public static void main(String[] args) {

//		int arr[] = { 9, 8, 9, 6, 9, 5, 8 };
		int arr[] = { 0, -2, 0, -3, 0, -4 };

		System.out.println("Max Element: " + findMax(arr));
		System.out.println("Second Maximum Element: " + findSecondMax(arr));
	}

	

}
