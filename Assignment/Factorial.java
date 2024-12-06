package Assignment;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        getFactorial(n);
	}
   
	public static void getFactorial(int n) {
		int i=n;
		long fact = 1;
		
		if(i<0){
			System.out.println("Negative numbers can not have factorials!!!");
		}
		else {
			System.out.println("The factorial of "+n+"!"+" is : ");
				while(i>=1) {
					fact=fact*i;
							if(i==1) {
							System.out.print(i+" ");
							}
							else {
							System.out.print(i+"*");	
							}
					i--;
				}
			System.out.println(" = "+fact);	
		}
	
		}	
}
