package biggestOf2;

import java.util.Scanner;

public class userInputTask9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		 float n1 = sc.nextFloat();
		 System.out.println("Enter the second number : ");
		 float n2 = sc.nextFloat();
		 System.out.println("Enter the Third number : ");
		 float n3 = sc.nextFloat();
		 getAverage(n1,n2,n3);
	}
	public static void getAverage(float n1,float n2,float n3) {
		float avg = (n1+n2+n3)/3;
		System.out.println("The Average is : "+ avg);
	}

}
 