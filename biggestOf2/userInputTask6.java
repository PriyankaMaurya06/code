package biggestOf2;

import java.util.Scanner;

public class userInputTask6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First side : ");
		 int n1 = sc.nextInt();
		 System.out.println("Enter Second side : ");
		 int n2 = sc.nextInt();
		 System.out.println("Enter Third side : ");
		 int n3= sc.nextInt();
		 getTriangle(n1,n2,n3);

	}
	
  public static void getTriangle(int a,int b,int c) {
	  if(a+b>c && b+c>a && a+c>b) {
		  System.out.println("It will form a valid Triangle");
	  }
	  else {
		  System.out.println("It will not form a valid Triangle");
	  }
  }
}
