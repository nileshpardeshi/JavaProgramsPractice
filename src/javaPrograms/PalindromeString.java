package javaPrograms;

import java.util.Scanner;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.next();
		
		String rev="";
		
		int len=str.length();
		
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is NOT palindrome");
		}
			

	}

}
