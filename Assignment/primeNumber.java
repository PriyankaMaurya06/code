package Assignment;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check whether it is prime or not : ");
		int n = sc.nextInt();
		if(getPrime(n))
		      System.out.println(n+" is a Prime Number.");
		else
			System.out.println(n+" is not a Prime Number.");
	}
	
	public static boolean getPrime(int n) {
		int i = 2;
		while(i<Math.sqrt(n)) {
			if(n%i==0) 
				 return false;
			
		i++;	     
				  
		}
	return true;
	}

}
