package com.hackerrank.data_structures.arrays;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		int val = 0;
		int numberQ = sc.nextInt();
		int max = 0;
		int valInsert = 0;

		for (int x = 0; x < numberQ; x++) {
			val = sc.nextInt();

			// Insert the value
			if (val == 1) {
				valInsert = sc.nextInt();
				list.push(valInsert);

				if (max < valInsert) {
					max = valInsert;
				}

				// get the last value from the list and test if it is greater than the max
				// need to test max here because the time complexity
			} else if (val == 2) {
				int valDelete = list.pop();

				if (list.size() > 0) {
					if (valDelete > max || valDelete == max) {
						max = Collections.max(list);
					}
				} else {
					max = 0;
				}

			} else if (val == 3) {
				System.out.println(max);
			}
		}

		sc.close();
	}

}
