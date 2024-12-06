package biggestOf2;

import java.util.Scanner;

public class userInputTask7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		 char ch = sc.next().charAt(0);
		 getAlpha(ch);
	}
	public static void getAlpha(char a) {
		if(a>='a'&& a<='z' || a>'A' && a<'Z'){
			System.out.println("It is a Alphabet");
		}
		else {
			System.out.println("It is not a Alphabet");
		}
	}

}
