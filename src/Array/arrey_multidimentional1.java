package Array;

public class arrey_multidimentional1 
{         //   0    1    2
	//0  //   10   20   30
	//1 //    20   30   40
	public static void main(String[] args)
	{
		//Arrey decleration and initialization
		int [][] S= { {10,20,30},{20,30,40} };
		
		//usage
		for(int i=0;i<=1;i++)
		{
			for(int a=0;a<=2;a++)
			{
				System.out.print(S[i][a]+" ");
			}
			System.out.println();
		}
		
		
	}

}
