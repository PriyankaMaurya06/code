package biggestOf2;
import java.util.Scanner;
public class userInputTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter First number : ");
	 double n1 = sc.nextDouble();
	 System.out.println("Enter Second number : ");
	 double n2 = sc.nextDouble();
	 System.out.println("Enter Third number : ");
	 double n3 = sc.nextDouble();
	 getSumAndProduct(n1,n2,n3);

	}

	public static void getSumAndProduct(double a,double b,double c) {
		double sum = a+b+c;
		double product = a*b*c;
		System.out.println("The Sum is : "+sum);
		 System.out.println("The Product is : "+product);
	}
}
