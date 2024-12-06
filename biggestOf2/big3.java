package biggestOf2;

public class big3 {

	public static void main(String[] args) {
	     int a=50;
	      int b=100;
	      int c=64;
	       int big=getBig(a,b,c);
	       
	       
	   System.out.println("biggest from "+a+ ", "+b+", "+c+" is :" + big);
	   
	    }
	public static int getBig(int a,int b, int c)
	{
		return ((a>b)?a:b)>c?((a>b)?a:b):c;
		
				 
	}
	   
	   
	   
         
	    


	

}
