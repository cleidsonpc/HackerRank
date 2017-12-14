package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		int diag1 = 0;
		int diag2 = n - 1;
		int rDiag1 = 0;
		int rDiag2 = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			rDiag1 += a[a_i][diag1];
			rDiag2 += a[a_i][diag2];

			diag1++;
			diag2--;

			// System.out.println(diag1 + " = " + rDiag1 + " | " + diag2 + " = " + rDiag2);
		}

		int r = rDiag1 - rDiag2;
		if (r < 0)
			r = r * -1;

		System.out.println(r);

	}

}
