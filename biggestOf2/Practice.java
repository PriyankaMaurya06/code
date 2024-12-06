package biggestOf2;
import java.util.Scanner;

public class Practice {
           public static void main(String[] args) {
        	   Scanner sc = new Scanner(System.in);
        	  /* System.out.println("Enter First number: ");
        	   int first = sc.nextInt();
        	   System.out.println("Enter Second number: ");
        	   int second = sc.nextInt();
        	   
        	  if(first>second) {
        		  System.out.println(first+" is greater than "+second);
        	  }
        	  else {
        		  System.out.println(second+" is greater than "+first);
        	  } */
        	   // ==========check if it is square shape or not. ==========
        	  /* System.out.println("Enter value of Lenth: ");
        	   int len = sc.nextInt();
        	   System.out.println("Enter value of Breadth");
        	   int bread = sc.nextInt();
        	   
        	   if (len==bread) {
        		   
        		   System.out.println("This is a Square Shape.");
        		  
        	   }
        	   else {
        		   
        		   System.out.println("This is not a Square Shape");
        		   
        	   }*/
        //=====================================================================	 
        	   System.out.println("\n===========Welcome To Our Shop===============");
        	   System.out.println("\nOne unit price is Rupees 100 /-");
        	   System.out.println("------------------------------------");
        	   System.out.println("If you buy atleast 10 units, you will get 10% Discount");
        	   System.out.println("-------------------------------------------------------");
        	   System.out.println("How Many units you want to Purchase: ");
        	   int unit=sc.nextInt();
        	   
        	   if(unit>=10 && unit<=15) {
        		   int amount =unit*100;
        		   double dis = (unit*100-(unit*100)*0.1);
        		   System.out.println("\n\n**********Congratulations you got 10% discount***********");
        		   System.out.println("\nOriginal amount is : "+amount);
        		   System.out.println("\nYour Amount after Discount is Rupees "+dis);
        	   }
        	   else if(unit>=16 &&  unit<=20) {
        		   int amount =unit*100;
        		   double dis = (unit*100-(unit*100)*0.2);
        		   System.out.println("\n\n**********Congratulations you got 20% discount***********");
        		   System.out.println("\nOriginal amount is : "+amount);
        		   System.out.println("\nYour Amount after Discount is Rupees "+dis);
        	   }
        	   else if(unit>=21) {
        		   int amount =unit*100;
        		   double dis = (unit*100-(unit*100)*0.5);
        		   System.out.println("\n\n**********Congratulations you got 50% discount***********");
        		   System.out.println("\nOriginal amount is : "+amount);
        		   System.out.println("\nYour Amount after Discount is Rupees "+dis);
        	   }
        	   else {
        		   int amount =unit*100;
        		   System.out.println("Your Amount is Rupees "+amount);
        	   }
        	   
        	   System.out.println("\n\n***********Thanks For Vist*************");
        	   
        	   
           }
}
