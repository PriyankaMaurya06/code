package biggestOf2;

import java.util.Scanner;

public class userInputTask8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		 String s1 = sc.nextLine();
		 System.out.println("Enter the second String : ");
		 String s2 = sc.nextLine();
		 getLen(s1,s2);

	}
	public static void getLen(String s1,String s2) {
		if(s1.length()>s2.length()) {
			System.out.println(" first string is bigger");
			
		}
		else {
			System.out.println(" Second string is bigger");
		}
		
	}

}
