package javaPrograms;

import java.util.Scanner;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of First Number :");
		int a=sc.nextInt();
		
		System.out.println("Enter the Value of Second Number :");
		int b=sc.nextInt();
		
		System.out.println("Enter the Value of Third Number :");
		int c=sc.nextInt();
		
		//logic 1
		
	/*	if(a>b && a>c)
		{
			System.out.println(a +"is Greatest Number");
		}
		else if(b>c)
		{
			System.out.println(b +"is Greatest Number");
		}
		else
		{
			System.out.println(c +"is Greatest Number");
		}
	*/
		
		//using ternary operator
		//(condition?true:false)
		
		//int largest1=a>b?a:b;
		//int largest=c>largest1?c:largest1;
		
		int largest2=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest2 +"is Greates Number");
	}

}
