package javaPrograms;
/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class CountCharOccurances {

	public static void main(String[] args) {
		
		String str="Nilesh is a engineer";
		
		int total_len=str.length();
		
		int removed_len=str.replace("e", "").length();
		
		int total=total_len-removed_len;
		
		System.out.println("Total occurance of char is :"+total);
		
		
	}

}
