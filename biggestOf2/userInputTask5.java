package biggestOf2;

import java.util.Scanner;

public class userInputTask5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		 int n1 = sc.nextInt();
		 System.out.println("Enter Second number : ");
		 int n2 = sc.nextInt();
		 getEvenOdd(n1,n2);
	}
   public static void getEvenOdd(int a, int b) {
	   if(a%2==0 && b%2==0) {
			  System.out.println("Even");
			  }
		  else 
			  System.out.println("Odd");
		  }
	
   
}
