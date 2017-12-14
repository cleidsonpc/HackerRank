package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		process(arr);

		in.close();
	}

	private static void process(int[] arr) {

		Long sumMin = 0L;
		Long sumMax = 0L;

		long aux[] = new long[arr.length];

		for (int x = 0; x < arr.length; x++) {
			for (int i = 0; i < arr.length; i++) {
				if (x != i)
					aux[x] += Long.valueOf(arr[i]);
			}
		}

		for (Long val : aux) {
			if (sumMin > val || sumMin == 0)
				sumMin = val;
			if (sumMax < val || sumMax == 0)
				sumMax = val;
		}

		System.out.println(String.format("%S %S", sumMin, sumMax));
	}

}
