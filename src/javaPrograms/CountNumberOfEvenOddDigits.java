package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class CountNumberOfEvenOddDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");

		int num = sc.nextInt();
		int even_count = 0;
		int odd_count = 0;
		
		List<Integer> myListEven = new ArrayList<Integer>();
		List<Integer> myListOdd = new ArrayList<Integer>();

		while (num > 0) {
			int rem = num % 10;

			if (rem % 2 == 0) {
				even_count++;
				myListEven.add(rem);

			} else {
				odd_count++;
				myListOdd.add(rem);

			}

			num = num / 10;
		}
		
		System.out.println("Even Count is :" + even_count + "\n" + "Odd Count is :" + odd_count);
		System.out.println("Even Numbers are: "+myListEven);
		System.out.println("Even Numbers are: "+myListOdd);
		
		sc.close();
	}

}
