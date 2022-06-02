package Array;

import java.util.Arrays;

public class Intarreydecs1 
{
	public static void main(String[] args) 
	{
		//Arrey decleration
		int []ar=new int[5];
		
		//Array inisalisation
		ar[0]=300;
		ar[1]=100;
		ar[2]=200;
		ar[3]=500;
		ar[4]=400;
		
		
		//usage
		Arrays.sort(ar);         //to create assending
		
		//print decending order
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	}

}
