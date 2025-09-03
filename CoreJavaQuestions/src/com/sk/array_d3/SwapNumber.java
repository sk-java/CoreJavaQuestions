package com.sk.array_d3;

public class SwapNumber {

	static void swap(int a, int b) {
		System.out.println("Before Swap: a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After  Swap: a = " + a + ", b = " + b);
	}

	static void swapWithoutTemp(int a, int b) {
		System.out.println("Before Swap: a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After  Swap: a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {

		int a = 9, b = 2;
		swap(a, b);
		System.out.println("==========================");
		swapWithoutTemp(a, b);
	}
}
