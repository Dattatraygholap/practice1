package Array;

public class Intarray3 
{
	public static void main(String[]args)
	{
	         //Array decleration
			int[]ar=new int [5];
			
			//Array inisalisation
			ar[0]=300;
			ar[1]=100;
			ar[2]=200;
			ar[3]=500;
			
			
			
			//Usage
			System.out.println(ar[0]);
			System.out.println(ar[1]);
			System.out.println(ar[2]);
			System.out.println(ar[3]);
			System.out.println(ar[4]);
			
			
			
			//OR
			System.out.println("-----------------------");
			
			for(int i=0; i<=4; i++)
			{
				System.out.println(ar[i]);
			}
			
		}

}
