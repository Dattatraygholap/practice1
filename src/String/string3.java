package String;

public class string3 
{
	public static void main(String[] args) 
	{
		//without using new keyword
		String S1="XYZ";
		String S2="XYZ";
		String S3="XYZ1";
		
		
		//with using new keyword
		String S4=new String("XYZ");
		String S5=new String("XYZ");
		String S6=new String("XYZ1");
		
		
		
		System.out.println(S1==S2);
		System.out.println(S1==S3);
		System.out.println(S4==S5);
		System.out.println(S4==S6);
		System.out.println(S1==S4);
		System.out.println(S6==S3);
		
		
	}

}
