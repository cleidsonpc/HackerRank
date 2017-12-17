package com.hackerrank.Implementation;

import java.util.Scanner;

public class GradingStudents {
	
    private static int[] solve(int[] grades){
    	int multiple = 5;
    	for(int x=0; x<grades.length; x++) {
    		
    		if(grades[x] >= 38) {
    			// Is it multiple of 5?
    			grades[x] = getNextMultiple(grades[x], multiple);
    		}
    	}
    	
    	return grades;
    }
    
    private static int getNextMultiple(int value, int multiple) {
    	int nextMultiple = value;
    	for(int x=value; x<value + multiple; x++) {
    		if(x % multiple == 0) {
    			
    			// Rounding if the multiple is less than 3
    			if(x - value < 3)
    				nextMultiple = x;
    			break;
    		}
    	}
    	return nextMultiple;
    }
    
    
    
    
    /**
     * To local test
     * @param args
     */
    public static void main(String[] args) {
    	
        int[] grades = new int[4];
        grades[0] = 73;
		grades[1] = 67;
		grades[2] = 38;
		grades[3] = 33;
        
        int[] result = solve(grades);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
    }
    
    /**
     * Original from the site.
     * @param args
     */
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        
        int[] result = solve(grades);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        
        in.close();
    }
    
}
