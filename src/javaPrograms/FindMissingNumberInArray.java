package javaPrograms;

import java.util.HashSet;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[]= {4, 1, 0, 2, 9, 6, 8, 6, 7, 5, 3};
		int b[]= {6, 4, 7, 2, 1, 0, 8, 3, 6, 9};
		
		int a_size=a.length;
		int b_size=b.length;
		
		findMissingNum(a, b, a_size, b_size);
				
	}
	
	public static void findMissingNum(int a[],int b[],int a_size, int b_size) {
		
		HashSet<Integer> bArr=new HashSet<Integer>();
		
		for(int i=0;i<b_size;i++)
		{
			bArr.add(b[i]);
			
		}
		System.out.println("B array elements are :"+bArr);
		
		for(int j=0;j<a_size;j++)
		{
			if(!bArr.contains(a[j]))
			{
				System.out.println(a[j]);
			}
		}
		
	}

}
