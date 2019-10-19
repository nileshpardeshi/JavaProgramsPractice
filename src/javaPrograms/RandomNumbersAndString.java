package javaPrograms;

import java.util.Random;
import java.util.stream.DoubleStream;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */
public class RandomNumbersAndString {

	public static void main(String[] args) {
		
		//Type 1: using Random class
	/*	Random ran=new Random();
		int num=ran.nextInt(100);
		System.out.println(num);
		
		double d=ran.nextDouble();   //from 0.0 to less than 1.0
		System.out.println(d); */
		
		//Type2: Using math class
		//System.out.println(Math.random());
		
		//type3: using Apache-commons-lang API
		String alpha=RandomStringUtils.randomAlphabetic(10); //10 random chars
		System.out.println(alpha);
		
		String num=RandomStringUtils.randomNumeric(5);  //5 digits random number
		System.out.println(num);
		
	}

}
