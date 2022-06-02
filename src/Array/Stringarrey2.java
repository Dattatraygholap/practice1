package Array;

public class Stringarrey2
{
	public static void main(String[] args) 
	{
		//arrey decleration
		String[]A=new String[4];
		
		//arrey inisalisation
		
		A[0]="Virat";
		A[1]="Rohit";
		A[2]="Rahul";
		A[3]="MSD";
		
		
		//uses
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		System.out.println(A[3]);
		
		System.out.println("-----------------------------");
		
		for(int i=0;i<=A.length-1;i++)
		{
			System.out.println(A[i]);
		}
		
	}

}
