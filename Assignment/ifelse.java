package Assignment;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a: ");
		double a=sc.nextDouble();
		System.out.println("ENter b: ");
		double b=sc.nextDouble();
		System.out.println("ENter c: ");
		double c=sc.nextDouble();
		getRoots(a,b,c);
	}	
	public static void getRoots(double a, double b, double c){
		double d=b*b-4*a*c;
		if(d>=0){
			System.out.println("Real Roots are Possible");
			double r1=(-b+Math.sqrt(d))/(2*a);
			double r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("1st Root is: "+r1);
			System.out.println("2nd Root is: "+r2);
		}
		else
			System.out.println("Real Roots are NOT Possible!");

		 

	}

}
