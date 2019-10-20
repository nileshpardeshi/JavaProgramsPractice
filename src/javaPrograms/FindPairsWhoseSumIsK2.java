package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindPairsWhoseSumIsK2 {

	    public static void main(String[] args) 
	    { 
	        int A[] = {1, 1, 2, 3, 4}; 
	        int sum = 4; 
	        System.out.println("Array before sorting"+Arrays.toString(A));
	        Arrays.parallelSort(A);
	        System.out.println("Array after sorting"+Arrays.toString(A));
	        int l=0;
	        int r=A.length-1;
	        
	        while(l<r)
	        {
	        	if(A[l]+A[r]>sum)
	        	{
	        		r--;
	        	}
	        	else if (A[l]+A[r]<sum) {
					l++;
				}
	        	else {
					System.out.println(A[l]+","+A[r]);
					l++;
				}
	        }
	         
	    } 
	} 
