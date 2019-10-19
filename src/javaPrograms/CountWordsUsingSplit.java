package javaPrograms;

import java.util.Scanner;

public class CountWordsUsingSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		
		System.out.println(countWords(str));
	}
	
	 public static int countWords(String input) {
		    if (input == null || input.isEmpty()) {
		      return 0;
		    }

		    String[] words = input.split("\\s+");
		    return words.length;
		  }
	 
	 /**
	  * public static int countWordsUsingStringTokenizer(String sentence) {
    if (sentence == null || sentence.isEmpty()) {
      return 0;
    }
    StringTokenizer tokens = new StringTokenizer(sentence);
    return tokens.countTokens();
  }
	  */

}
