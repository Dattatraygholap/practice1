package Logical_program;

public class Armestrong_no 
{
	public static void main(String[] args) 
	{
		//153   1    5    3
		//      1   125   27 =153
		
		int org=153;
		
		int sum=0;
		
		for(int i=org;i>0;i=i/10)
		{
			int rem=i % 10;
			
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);
		
		if(org==sum)
		{
			System.out.println("Given no is an Armestrong no");
		}
		else
		{
			System.out.println("Given no is not an Armestrong no");
		}
	}

}
