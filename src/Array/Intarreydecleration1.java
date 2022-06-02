package Array;

import java.util.Arrays;

public class Intarreydecleration1
{
	

	public static void main(String[] args) 
	{
		//arrey decleration and inisalisation
		
		int[]ar1= {300,100,200,500,400};
		
		//usage
		
		Arrays.sort(ar1);         //assending order
		
		
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.println(ar1[i]);
		}
		
	}

}
