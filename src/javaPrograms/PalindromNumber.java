package javaPrograms;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int original_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		if(rev==original_num)
		{
			System.out.println("Given number is Palindrome");
		}
		else {
			System.out.println("Given number is NOT Palindrome");
		}
		
		
	}

}
