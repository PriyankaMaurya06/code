package biggestOf2;

import java.util.Scanner;

public class userInputTask10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first subject marks : ");
		 float n1 = sc.nextFloat();
		 System.out.println("Enter the second subject marks : ");
		 float n2 = sc.nextFloat();
		 System.out.println("Enter the third subject marks : ");
		 float n3 = sc.nextFloat();
		 System.out.println("Enter the fourth subject marks : ");
		 float n4 = sc.nextFloat();
		 System.out.println("Enter the fifth subject marks : ");
		 float n5 = sc.nextFloat();
		 gerPercentage(n1,n2,n3,n4,n5);

	}
	public static void gerPercentage(float n1,float n2,float n3,float n4,float n5) {
		float per = (n1+n2+n3+n4+n5)/5;
		System.out.println("The percentage is : "+per+" % ");
	}

}
