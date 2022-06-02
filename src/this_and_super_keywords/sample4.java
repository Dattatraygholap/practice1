package this_and_super_keywords;

public class sample4 extends sample2
{
	int a=20;
	char b=('a');
	float c=(15.6f);
	String d=("vivek");
	
	
	public void m1()
	{
		int a=4;
		char b=('B');
		float c=(16.3f);
		String d=("dattatray");
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(super.b);
		System.out.println(c);
		System.out.println(this.c);
		System.out.println(d);
		System.out.println(this.d);
		
		
	}
	public static void main(String[] args) 
	{
		//create object
		sample4 S1=new sample4();
		//call the method
		S1.m1();
		S1.m3();
		
		
		
	}
	

}
