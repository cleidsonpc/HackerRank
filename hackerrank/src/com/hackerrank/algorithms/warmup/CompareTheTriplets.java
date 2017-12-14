package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {

	private static int alice = 0;
	private static int bob = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		cal(a0, b0);
		cal(a1, b1);
		cal(a2, b2);

		System.out.println(alice + " " + bob);
	}

	private static void cal(int valAlice, int valBob) {
		if (valAlice != valBob) {
			if (valAlice > valBob) {
				alice += 1;
			} else {
				bob += 1;
			}
		}
	}

}
