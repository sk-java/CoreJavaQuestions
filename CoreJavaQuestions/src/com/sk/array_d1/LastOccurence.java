package com.sk.array_d1;

public class LastOccurence {

	// last occurrence
	static int lastOccurrence(int[] arr, int x) {
		int lastIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

	public static void main(String[] args) {
		
		int arr[] = { 5, 1, 3, 5, 6, 4, 3 };
		int x = 5;
		System.out.println("Last Occurence of "+x + " at index: "+lastOccurrence(arr, x));
	}

}
