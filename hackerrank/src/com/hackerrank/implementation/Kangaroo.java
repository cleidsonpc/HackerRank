package com.hackerrank.implementation;

public class Kangaroo {
	
	private static String result = "NO";
	private static int sum1 = -1;
	private static int sum2 = -1;
	
	private static String kangaroo(int x1, int v1, int x2, int v2) {
		
		if(sum1 == -1 && sum2 == -1) {
			sum1 = x1;
			sum2 = x2;
		}
		
		if(x1 < 0 || x2 < 0)
			result = "NO";
		
		else if(v1 < 1 || v2 < 1)
			result = "NO";
			
		else {
				
			sum1 += v1;
			sum2 += v2;
			
			if(v1 > v2 && sum1 > sum2)
				result = "NO";
			
			else if(v1 < v2 && sum1 < sum2)
				result = "NO";
			
			else if(sum1 == sum2)
				result = "YES";
			
			else
				result = kangaroo(x1, v1, x2, v2);
		}
		return result;
    }
	
	public static void main(String[] args) {

		// TEST 001
		int x1 = 0;
		int v1 = 3;
		int x2 = 4;
		int v2 = 2;
		result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		// TEST 002
		x1 = 0;
		v1 = 2;
		x2 = 5;
		v2 = 3;
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		// TEST 003
		x1 = 0;
		v1 = 0;
		x2 = 0;
		v2 = 0;
		result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		// TEST 004
		x1 = -1;
		v1 = 3;
		x2 = 4;
		v2 = 2;
		result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
		
		// TEST 005
		x1 = 99999;
		v1 = 1;
		x2 = 0;
		v2 = 2;
		result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}
	
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x1 = in.nextInt();
//        int v1 = in.nextInt();
//        int x2 = in.nextInt();
//        int v2 = in.nextInt();
//        String result = kangaroo(x1, v1, x2, v2);
//        System.out.println(result);
//    }
    
}
