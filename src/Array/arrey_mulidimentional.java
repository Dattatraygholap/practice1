package Array;

public class arrey_mulidimentional
{
	   // 0    1     2
 //0  // 10   20    30
//1  //  30   20    60
	
	public static void main(String[] args) 
	{
		
		
		//Arrey decleration
		int [][] ar=new int [2][3];     //First prefrance of row
		//Arrey initailization
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=30;
		ar[1][1]=20;
		ar[1][2]=60;
		
		//usage
		for(int i=0;i<=1;i++)
		{
			for(int a=0;a<=2;a++)
			{
				System.out.print(ar[i][a]+" ");
			}
			System.out.println();
			
	
			
			
		}
		
	}

}
