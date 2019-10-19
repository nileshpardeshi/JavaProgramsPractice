package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ABCD";
		String rev = "";

		// Logic 1: using charAt method
		/*
		 * int len=str.length();
		 * 
		 * for(int i=len-1;i>=0;i--) 
		 * { 
		 * rev=rev+str.charAt(i); 
		 * }
		 * 
		 * System.out.println("Reverse string is: "+rev);
		 */
		
		//logic 2: using character array
		
		/*
		 * char a[]=str.toCharArray();
		 * 
		 * int len=a.length;
		 * 
		 * for(int i=len-1;i>=0;i--) 
		 * { 
		 * rev=rev+a[i]; 
		 * }
		 * System.out.println("Reverse string is: "+rev);
		 */
		
		//logic 3: using string buffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}

}
