package Loops;

import Access_specifior.sample1;

public class demo1
{
public static void main(String[] args)
{
	sample1 Z1=new sample1();
	Z1.m1();
	Z1.m2();
	System.out.println(Z1.a);
	
	demo1 S1=new demo1();
	S1.m4();
}

void m4()
{
	System.out.println("done");
}
}
