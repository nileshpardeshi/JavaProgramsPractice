package javaPrograms;

import java.util.Scanner;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */
public class PrintEvenOddNoInArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the array numbers :");
		
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		
		System.out.print("Array elements are :");
		for(int print:arr)
		{
			System.out.println(+print);
		}
		
		System.out.println("Even Numbers are :");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				System.out.println(arr[j]);
			}
		}
		
		System.out.println("Odd Numbers are :");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2!=0)
			{
				System.out.println(arr[j]);
			}
		}
	}

}
