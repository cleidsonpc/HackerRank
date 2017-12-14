package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main2(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}

	public static void main(String[] args) {
		int n = 4;
		int[] ar = new int[n];
		ar[0] = 3;
		ar[1] = 2;
		ar[2] = 1;
		ar[3] = 3;

		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}

	private static int birthdayCakeCandles(int n, int[] ar) {
		int tallCandle = 0;
		int sumCandle = 0;

		for (int val : ar) {
			if (tallCandle < val)
				tallCandle = val;
		}

		for (int val : ar) {
			if (val == tallCandle)
				sumCandle++;
		}

		return sumCandle;
	}

}
