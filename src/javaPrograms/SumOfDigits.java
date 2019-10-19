package javaPrograms;

import java.util.Scanner;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10; //this gives you last number
			sum=sum+rem;
			num=num/10;  //this eliminates the last number
		}
		System.out.println("Sume is :"+sum);

	}

}
