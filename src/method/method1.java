package method;

public class method1 
{  
	//class body
	//static regular method call from same class
	public static void main(String[]args)
	
	{    //main method body
		System.out.println("main method started");
		System.out.println("main method ended");
		m1();     //method name();
		m2();     //method name();
	}
	
	//static regular method
	public static void m1()
	{
		System.out.println("satic regular method running from same class:m1");
	}
	
	
	//static regular method
	public static void m2()
	{
		System.out.println("static regular method running from same class:m2");
	}

}
