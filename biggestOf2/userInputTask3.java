package biggestOf2;
import java.util.Scanner;
public class userInputTask3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		 int n1 = sc.nextInt();
		 System.out.println("Enter Second number : ");
		 int n2 = sc.nextInt();
		 getBig(n1,n2);
	}
	public static void getBig(int a, int b) {
		if(a>b) {
			System.out.println(a+" is bigger");
		
		}
		else {
			System.out.println(b+ " is bigger");
		}
	}

}
