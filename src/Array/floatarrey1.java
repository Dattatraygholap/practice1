package Array;

public class floatarrey1 
{
	public static void main(String[] args)
	{
		//Arrey decleration
		float []a=new float[5];
		
		//Arrey inisalisation
		a[0]=10.1f;
		a[1]=20;
		a[2]=30.1f;
		a[3]=40;
		a[4]=50.1f;
		
		
		//Uses
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("---------------------");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("-----------------------");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
