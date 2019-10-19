package javaPrograms;

import java.util.Scanner;

public class ReverserNumber {

	public static void main(String[] args) {
		
		int num;
		int rev=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");		
		num=sc.nextInt();
		System.out.println("Entered Number is :" +num);
		
		
		//Method 1 using logic
		
		/*while(num!=0)
		{
			rev=rev*10+num%10;  
			//0*10+1234%10=0+4=4
			//4*10+123%10=40+3=43
			//430+2=432
			//4320+1=4321
			
			num=num/10;
			//1234/10=123
			//123/10=12
			//12/10=1
			//1/10=0
			
		}
		
		System.out.println("Reverse Number is:"+ rev);*/
		
		//method 2 using StringBuffer class
		
		/*
		 * StringBuffer sb=new StringBuffer(String.valueOf(num)); 
		 * StringBuffer rev1=sb.reverse(); 
		 * System.out.println("Reverse Number is:"+ rev1);
		 */
		
		//method 3 using StringBuilder class
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev1=sb.reverse();
		System.out.println(rev1);
		
		
	}

}
