package biggestOf2;
import java.util.Scanner;
public class userInputTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		 int n1 = sc.nextInt();
		 System.out.println("Enter Second number : ");
		 int n2 = sc.nextInt();
		 getSum(n1,n2);
	}
  public static void getSum(int a, int b) {
	  int sum = a+b;
	  System.out.println("The Sum is : "+sum);
	  if(sum%2==0) {
		  System.out.println("The Sum is even");
		  }
	  else {
		  System.out.println("The Sum is odd");
	  }
  }
}
