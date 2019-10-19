package javaPrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number :");
		int start = sc.nextInt();

		System.out.println("Enter the Last Number :");
		int last = sc.nextInt();

		for (int i = start; i <= last; i++) {

			if (isPrime(i)) {
				System.out.print(i + ",");

			}
			/*
			 * else { System.out.println(i + ",");
			 }*/

		}

	}

	public static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}
}
