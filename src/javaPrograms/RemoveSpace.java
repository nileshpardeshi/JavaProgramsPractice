package javaPrograms;
/**
 * 
 * @author Nilesh Pardeshi
 *
 */

public class RemoveSpace {

	public static void main(String[] args) {
		String str="nilesh    Pardeshi    is    engineer";
		
		//String sorted=str.replaceAll("\\s", "");
		//or 
		String sorted=str.replace(" ","");
		System.out.println(sorted);
	}

}
