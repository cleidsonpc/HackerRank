package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main2(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        process(arr);
        
        in.close();
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 1000000001;
		arr[1] = 1000000002;
		arr[2] = 1000000003;
		arr[3] = 1000000004;
		arr[4] = 1000000005;
		
		process(arr);
	}
	
	private static void process(int[] arr) {
		long r = 0l;
		for (int x = 0; x < arr.length; x++) {
			r += arr[x];
		}

		System.out.println(r);
	}
	
}
