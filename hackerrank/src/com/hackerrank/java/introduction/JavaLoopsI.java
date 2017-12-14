package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		String r = new String();
		for (int x = 1; x <= 10; x++) {
			r = new String();

			// Format the output with String.format to avoid to use a lot of String concat.
			r = String.format("%1$-1s x %2$-1s = %3$-1s", N, x, N * x);

			System.out.println(r);
		}

	}

}
