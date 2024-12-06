package biggestOf2;
import java.util.Scanner;

public class userInputTask4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		 int n1 = sc.nextInt();
		 System.out.println("Enter Second number : ");
		 int n2 = sc.nextInt();
		 System.out.println("Enter Third number : ");
		 int n3 =sc.nextInt();
		 getBig(n1,n2,n3);

	}
	public static void getBig(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is bigger");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is bigger");
	    }
		else {
			System.out.println(c+" is bigger");
		}
	}
	

}
