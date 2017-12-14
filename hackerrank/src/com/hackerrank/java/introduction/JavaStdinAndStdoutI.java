package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt(); // Receive the second integer.
		int c = scan.nextInt(); // Receive the third integer.

		System.out.println(a);
		System.out.println(b); // Will print the second integer received.
		System.out.println(c); // Will print the third integer received.
	}

}
