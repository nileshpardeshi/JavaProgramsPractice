package javaPrograms;

import java.util.Arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int a[]= {4,2,1,5,3};
		int sum=0;
		
		System.out.println("Before array"+Arrays.toString(a));
		
		int n=a.length;
		
		/*
		 * for(int i=0;i<n;i++) {
		 * 
		 * sum=sum+a[i];
		 * 
		 * }
		 * 
		 * System.out.println("Total sum is: "+sum);
		 */
		
		//advanced for loop
		for(int value:a)
		{
			sum=sum+value;
		}
		
		System.out.println("Advanced for loop Total sum is: "+sum);
	}

}
