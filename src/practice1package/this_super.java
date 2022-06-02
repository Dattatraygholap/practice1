package practice1package;

public class this_super
{
	String a=("Vivek");
	int b=80;
	float c=0.99f;
	char d='A';
	public void m1()
	{
		int a=50;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
		
	}

	public static void main(String[] args)
	{
		this_super X1=new this_super();
		X1.m1();
		
	}
}
