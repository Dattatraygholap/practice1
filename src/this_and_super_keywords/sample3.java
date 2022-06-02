package this_and_super_keywords;

public class sample3 extends sample2
{
	int a=5;
	public void m2()
	{
		int a=15;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void main(String[] args) 
	{
		//create object for sample3
		sample3 X1=new sample3();
		X1.m2();
		X1.m3();
		
		
	}

}
