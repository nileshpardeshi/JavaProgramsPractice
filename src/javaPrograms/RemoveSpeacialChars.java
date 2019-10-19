package javaPrograms;
/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class RemoveSpeacialChars {

	public static void main(String[] args) {
		String str="nilesh@@$#%$!!%&^&*^&*^$^&$^)(*(*(&&*^&**Pardeshi";
		
		String sorted=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sorted);
	}

}
