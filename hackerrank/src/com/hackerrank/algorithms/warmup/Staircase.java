package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		process(n);

		in.close();
	}

	private static void process(int input) {
		StringBuilder print = new StringBuilder();
		String format = "%" + input + "s";
		for (int x = 1; x <= input; x++) {
			print.append("#");
			System.out.println(String.format(format, print));

		}
	}

}
