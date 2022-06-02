package polymorphism;

public class sample4 extends sample3
{
	public void mobile()
	

	{
		System.out.println("mobile:iphone"); 
		
	}
	
	public void money()
	{
		System.out.println("money:22 lac");
	}
	public void car()
	{
		System.out.println("car: Audi");
	}
	public void home()
	{
		System.out.println("Home:4 BHK");
		
	}
	public static void main(String[] args)
	{
		//create object
		sample4 X1=new sample4();
		X1.mobile();
		X1.money();
		X1.car();
		X1.home();
		X1.farm();
				
						
	}
}
