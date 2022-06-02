package this_and_super_keywords;

public class sample6 extends sample5
{
	 float proper_box = 701.7171f;
	    char movies_class = ('A');
	  public void A2()
	    {
	    	System.out.println("Movie Name:"+super.Name);
	    	System.out.println("Box:"+super.box);
	    	System.out.println("proper box:"+this.proper_box);
	    	System.out.println("Movies class:"+this.movies_class);
	    	System.out.println("Feedback:Jai ho Modi,Jai ho BJP");
	    }
	  public static void main(String[] args) 
	    {
			sample6 Z1=new sample6();
			Z1.A1();
			Z1.A2();
			
		
			
		}

}
