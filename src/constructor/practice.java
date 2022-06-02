package constructor;


public class practice 
{
	static int a=10;
	int b=20;
	public static void main(String[] args) 
	{
		practice S1=new practice();
		new practice(30,40);
		System.out.println(a);
		System.out.println(S1.b);
		new practice(40,50,60);
	}
	
	practice()
	{
		this(30,40);
		System.out.println(a);
		System.out.println(b);
	}
	practice(int c,int d)
	{
		this(40,50,60);
		int e=c+d;
		System.out.println(e);
	}
	practice(int c,int d,int a)
	{
		//this();
		int t=c+d+a;
		System.out.println(t);
	}
	

}
