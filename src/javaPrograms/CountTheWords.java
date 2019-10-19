package javaPrograms;

import java.util.Scanner;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */
public class CountTheWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		int count=1;
		
		int len=str.length();
		
		if(str==null || str.isEmpty())
		{
			System.out.println("Zero words");
		}
		else {
			for(int i=0; i<str.length();i++)
			{
				if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
				{
					count++;
				}
			}
			System.out.println("Total no. of words are :"+count);
		}
				
		
	}

}
