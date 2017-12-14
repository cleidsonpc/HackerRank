package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int r = 0;
			int mult = 1;
			for (int x = 1; x <= n; x++) {
				r += mult * b;
				mult *= 2;
				System.out.print(a + r + " ");
			}
			System.out.println("");
		}
		in.close();
	}

}
