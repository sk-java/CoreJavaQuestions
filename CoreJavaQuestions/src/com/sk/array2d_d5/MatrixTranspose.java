package com.sk.array2d_d5;

import java.util.Scanner;

//Write a program to display transpose of matrix entered by the user.
//	input: 					output:
//	1   2   3				1   4   7
//	4   5   6               2   5   8
//	7   8   9               3   5   9 
public class MatrixTranspose {

	static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] transpose(int[][] arr, int r, int c) {

		int ans[][] = new int[c][r];

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				ans[i][j] = arr[j][i];
			}
		}
		return ans;
	}

	static void transposeInPlace(int arr[][], int r, int c) {
		for (int i = 0; i < c; i++) {
			for (int j = i; j < r; j++) {
				// swap
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns of matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] arr = new int[r][c];

		System.out.println("Enter " + r * c + " elements ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Input Matrix: ");
		printMatrix(arr);

		System.out.println("Transpose Matrix: ");
//		int[][] ans = transpose(arr, r, c);
//		printMatrix(ans);

		transposeInPlace(arr, r, c);
		printMatrix(arr);
	}

}
