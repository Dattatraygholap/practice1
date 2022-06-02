package constructor;

public class mock
{

	mock()
	{this(12);
		System.out.println("Good morning");
		
	}
	
	mock(int a)
	{
		System.out.println("Good evining");
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
	mock s1=new mock();
	}

}
