package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		process(arr, n);

		in.close();
	}

	private static void process(int[] arr, int div) {

		double result;
		double valPositive = 0;
		double valNegative = 0;
		double valZero = 0;

		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > 0) {
				valPositive++;
			} else if (arr[x] < 0) {
				valNegative++;
			} else {
				valZero++;
			}
		}

		result = valPositive / div;
		System.out.println(String.format("%6f", result));

		result = valNegative / div;
		System.out.println(String.format("%6f", result));

		result = valZero / div;
		System.out.println(String.format("%6f", result));

	}

}
