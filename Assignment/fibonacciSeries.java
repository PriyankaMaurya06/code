package Assignment;
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get Fibonacci Series : ");
		int n = sc.nextInt();
		getFibonacciSeries(n);
	}

	public static void getFibonacciSeries(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 ;
		int i=3;
		System.out.print(n1+ " " + n2);
		while(i<=n) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
		}
	}
}
