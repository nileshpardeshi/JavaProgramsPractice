package javaPrograms;

import java.util.Arrays;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {4,2,1,5,3};
		
		System.out.println("Before array"+Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0; i<n-1; i++) //this for loop is for pass
		{
			for(int j=0; j<n-1; j++) //this for loop is for swapping
			{
				if (a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		
		System.out.println("Sorted array is"+Arrays.toString(a));
	}

}
