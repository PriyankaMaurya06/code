package biggestOf2;

public class triangle {
       public static void main(String[] args)
       {
    	   int s1=3;
    	   int s2=4;
    	   int s3=5;
    	   String t=getTriangle(s1, s2, s3);
    	   System.out.println(t);
       }
       public static String getTriangle(int a,int b,int c)
       {
    	   String n = (a+b>c&&b+c>a&&c+a>b)?"will form a triangle":"will not form a triangle";
    	   return n;
       }
}
 