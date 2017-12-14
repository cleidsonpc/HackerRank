package com.hackerrank.java.introduction;

import java.util.Locale;
import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.getDefault());

		int i = scan.nextInt();

		double d = scan.nextDouble(); // Get the double typed.

		scan.nextLine(); // Open a new line to get all the velue typed.
		String s = scan.nextLine(); // Get the String typed.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
