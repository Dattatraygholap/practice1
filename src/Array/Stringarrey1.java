package Array;

public class Stringarrey1
{
	public static void main(String[] args) 
	{
		//arrey decleration
		String[]A=new String[4];
		
		//arrey inisalisation
		A[0]="Dattatray";
		A[1]="Virat";
		A[2]="Rohit";
		
		
		System.out.println("-------------------------");
		for(int i=A.length-1;i>=0;i--)
		{
			System.out.println(A[i]);
		}
	}

}
