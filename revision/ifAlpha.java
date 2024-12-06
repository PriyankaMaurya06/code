package revision;

import java.util.Scanner;

public class ifAlpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char c = sc.next().charAt(0);
		String result= getAlpha(c);
		System.out.println(c + result);
 
	}
	public static String getAlpha(char a) {
		   
		return (a>='a' && a<='z')||(a>='A' && a<='Z') ? " is a alphabet" : " is Not a alphabet" ;
	}

}
