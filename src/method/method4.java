package method;

public class method4
{
	//not static method call from same class
	public static void main(String[]args)
	{
		System. out.println("main method started");         //main method
		System.out.println("main method ended");
		     //create object of same class
		method4 S1=new method4();           //classname objectname=new classname();
		     //call the method
		S1.m5();                            //objectname.methodname();
		S1.m6();                            //objectname.methodname();
	}
	
	//non-static regular method
	public void m5()
	{
		System.out.println("non static regular method is running from same class:m5");
	}
	//non-static regular method
	public void m6()
	{
		System.out.println("non static regular method is running from same class:m6");
	}
	}