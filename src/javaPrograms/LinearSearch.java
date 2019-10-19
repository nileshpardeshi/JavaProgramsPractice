package javaPrograms;

/**
 * 
 * @author Nilesh Pardeshi
 *
 */
		

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,40,30,50};
		int search_ele=50;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("element found at index: "+i);
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}
	}

}
