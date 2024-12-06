package biggestOf2;

import java.util.Scanner;

public class ifElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		if(n>=100 && n<=999)
		{
			System.out.println("It is a 3 digit number");
			int a =n%10;
			if(a%2==0)
			{
				System.out.println("last digit is even ");
			}
			else 
			{
				System.out.println("last digit is odd");
			}
		}
		else
		{
			System.out.println("It is a 3 digit number");
			int b =n%100;
			if(b%6==0)
			{
				System.out.println("last 2 digit is divisible by 6");
			}
			else
			{
				System.out.println("last 2 digit is not divisible by 6 ");
			}
		}

	}

}
