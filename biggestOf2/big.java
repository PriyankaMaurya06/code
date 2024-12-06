package biggestOf2;

public class big {
    public static void main(String[] args)
	    {
	      int a=50;
	      int b=27;
	   System.out.println("The number "+big(a,b));
	   
	    }
	   
	  public static String big(int a, int b)
	   {

	    return ( a>b ) ? a +" is the biggest" : b +" is the biggest"; 

	   }
}

