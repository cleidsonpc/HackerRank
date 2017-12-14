package com.hackerrank.data_structures.arrays;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		int arrNew[] = new int[n]; // created a new array to receive the new order.
		int index = 0; // control the index to the new array in a crecent order.

		// run the old array and get the new order.
		for (int x = arr.length - 1; x >= 0; x--) {
			arrNew[index] = arr[x];
			index++;
		}

		// print the result of the new array.
		for (int x = 0; x < arrNew.length; x++) {
			System.out.print(arrNew[x] + " ");
		}

	}

}
