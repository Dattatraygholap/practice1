package Array;

public class Intarrey4
{
	public static void main(String[] args) 
	{
		//Arrey decleration
		int[]ar=new int[5];
		
		//Arrey inisalisation
		ar[0]=300;
		ar[1]=100;
		ar[2]=200;
		ar[3]=500;
		ar[4]=400;
		
		
		//Usase
		System.out.println(ar.length);
		
		System.out.println("-----------------------");
		
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-------------------------");
		
		for (int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
