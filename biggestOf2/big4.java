
package biggestOf2;

public class big4 {
         public static void main(String[] args)
         {
        	 int a=22;
        	 int b=54;
        	 int c=35;
        	 int d=99;
        	 int big = getBig(a,b,c,d);
        	 System.out.println("Biggest from "+a+", "+b+", "+c+", "+d+" is : "+big);
         }
         
         public static int getBig(int p,int q,int r,int s)
         {
        	 return (((p>q)?p:q)>r?((p>q)?p:q):r)>s?(((p>q)?p:q)>r?((p>q)?p:q):r):s;
        			 
         }
} 
