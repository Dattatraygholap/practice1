package Array;

import java.util.Arrays;

public class stringarrey_p 
{
	public static void main(String[] args) 
	{
		//arrey decleration 
		String[]A=new String[4];
		
		//arrey inisalisation
		
		A[0]="virat";
		A[1]="Rohit";
		A[2]="Rahul";
		A[3]="MSD";
		
		//Usage
		Arrays.sort(A);
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(A[i]);
		}
		
	}

}
