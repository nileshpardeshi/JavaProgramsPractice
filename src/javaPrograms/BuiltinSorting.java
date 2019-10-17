package javaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class BuiltinSorting {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * Type 1 by parallel sort method
		 */
		
		/*
		 * int a[]= {60,30,50,20,70};
		 * 
		 * System.out.println("Array before sorting"+Arrays.toString(a));
		 * 
		 * Arrays.parallelSort(a);
		 * 
		 * System.out.println("Array after sorting"+Arrays.toString(a));
		 */

		
		/**
		 * 
		 * Type 2 by sort method
		 */
		
		/*
		 * int a[]= {60,30,50,20,70};
		 * 
		 * System.out.println("Array before sorting"+Arrays.toString(a));
		 * 
		 * Arrays.sort(a);
		 * 
		 * System.out.println("Array after sorting"+Arrays.toString(a));
		 */
		
		
		/**
		 * Type 3 to print in reverse order
		 */
		
		Integer a[]= {60,30,50,20,70};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("after sort"+Arrays.toString(a));
	}

}
