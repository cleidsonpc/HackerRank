package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {

			String s1 = sc.next();
			int x = sc.nextInt();

			// %1$-14s means: %1 = first index, $-14s = String with 14 slots to the left.
			// %2$03d means: %2 = second index, $03d = A number(digit) variable starting
			// with zero.
			String r = String.format("%1$-14s %2$03d", s1, x);
			System.out.println(r);

		}
		System.out.println("================================");
	}

}
