package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			ans = "Not Weird"; // All the others cases differents

			if (n >= 6 && n <= 20) {
				ans = "Weird";
			}
		}

		System.out.println(ans);

	}

}
