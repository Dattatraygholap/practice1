package constructor;

public class Sample_1
{
	//default constructor 
	//Use case -1:It copies the member of class in to an object------>after creation of object
	public static void main(String[] args)
	{
		//create object of same class
		Sample_1 S1=new Sample_1();
		//call the method
		S1.multification();
		
		//create object of different class
		Sample2 S2=new Sample2();
		//call the method
		S2.addition();
	}

	//non-static regular method
	public void multification()
	{
		int a=10;
		int b=20;
		int mulvalue=a*b;
		System.out.println( mulvalue);
	
	}
}
