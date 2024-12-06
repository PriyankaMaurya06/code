package biggestOf2;

public class division {
      public static void main(String[] args)
      { 
    	  int a=55;
    	  String b = getDiv(a);
    	  System.out.println("the number "+a+" is "+b+" both 5 and 11.");
      }
      public static String getDiv(int a)
      {
    	  return (a%5==0)&&(a%11==0)?"divisible by ":"not divisible by ";
      }
         
}
