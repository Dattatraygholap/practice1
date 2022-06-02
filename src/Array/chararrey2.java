package Array;

public class chararrey2 
{
	public static void main(String[] args) 
	{
		//arrey decleration
		char[] x=new char[4];
		
		//arrey inisalisation
		x[0]='A';
		x[1]='B';
		x[2]='C';
		
		
		
		//Uses
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		
		
		System.out.println("----------------");
		for(char i=0;i<=3;i++)
		{
			System.out.println(x[i]);
		}
		
		System.out.println("-------------");
		
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}
		System.out.println("----------------");
		
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println(x[i]);
		}
		
	}


}
