package abstract_class;

public class concrete extends incomplet_or_abstract_class
{
	//complete method 
	public void m2()             //method deceleration 
	{
		System.out.println("method m2 is complet in concrete class");   //method definition
	}
	
	//complete method 
	public void m3()                         //method deceleration 
	{
		System.out.println("method m3 is complete in concrete class");    //method definition
	}
	
	public static void main(String[] args) 
	{
		//create object
		concrete S1=new concrete();
		S1.m1();
		S1.m2();
		S1.m3();
	}
		
	

}
