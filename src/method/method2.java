package method;

public class method2 
{
	//static regular method call from different class
	public static void main(String[]args)
	{
		//main method
		System.out.println("main method started");
		System.out.println("main method ended");
		
		//call the method
		method3.m3();           //classname.methodname();
	}

}
