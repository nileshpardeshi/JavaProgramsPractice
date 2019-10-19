package javaPrograms;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class SwappningNumbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		//login 1: using 3rd variable
		/*
		 * int temp=a; 
		 * a=b; 
		 * b=temp;
		 * System.out.println("value of a is:"+a+" "+"value of b is: "+b);
		 */
		
		//logic2: without 3rd variable
		/*
		 * a=a+b; 
		 * b=a-b; 
		 * a=a-b;
		 * System.out.println("value of a is:"+a+" "+"value of b is: "+b);
		 */
		
		//logic 3: Single statement
		/*
		 * b=a+b-(a=b); 
		 * System.out.println("value of a is:"+a+" "+"value of b is: "+b);
		 */
		
		//logic4: using * and /
		/*
		 * a=a*b; 
		 * b=a/b; 
		 * a=a/b;
		 * System.out.println("value of a is:"+a+" "+"value of b is: "+b);
		 */
		
		//logic5: using bitwise XOR (^)
		/*
		 * a=a^b; 
		 * b=a^b; 
		 * a=a^b;
		 * System.out.println("value of a is:"+a+" "+"value of b is: "+b);
		 */
		
	}

}
