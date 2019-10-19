package javaPrograms;

import java.util.Scanner;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find the factorial :");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num +" is :"+fact);
	}

}
