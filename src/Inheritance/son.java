package Inheritance;

public class son extends Father
{
	//sub class
public void bike()
{
	System.out.println("bike:shaine");
}
public static void main(String[] args) 
{
	//crate the object
	son S1=new son();
	//call from method
	S1.bike();
	S1.car();
	S1.money();
	S1.home();
	
	
	
}
}
