package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}

		System.out.println(sum);
	}

}
