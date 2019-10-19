package javaPrograms;

import java.util.Arrays;

import javax.net.ssl.SSLEngineResult.Status;

public class CheckArraysEquals {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 5, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };

		// Approach 1: using equals method
		/*
		 * boolean Status=Arrays.equals(a1, a2);
		 * 
		 * if(Status==true) { System.out.println("Arrays are Equal"); } else {
		 * System.out.println("Arrays are NOT equal"); }
		 * 
		 */

		// Approach 2: using logic

		boolean status = true;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arrays are NOT equal");
		}

	}

}
