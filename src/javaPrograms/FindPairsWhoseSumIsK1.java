package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindPairsWhoseSumIsK1 {

	 static void printpairs(int arr[], int sum) 
	    { 
	        HashSet<Integer> s = new HashSet<Integer>(); 
	        for (int i = 0; i < arr.length; i++) { 
	            int temp = sum - arr[i]; 
	  
	            // checking for condition 
	            if (s.contains(temp)) { 
	                System.out.println("Pair with given sum " + sum + " is (" + temp + ", " + arr[i] + ")"); 
	            } 
	            s.add(arr[i]); 
	        } 
	    } 
	  
	    // Main to test the above function 
	    public static void main(String[] args) 
	    { 
	        int A[] = {1, 1, 2, 3, 4, 2}; 
	        int n = 4; 
	        printpairs(A, n); 
	    } 
	} 
