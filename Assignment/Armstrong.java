package Assignment;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if(getArmstrong(n))
			 System.out.println("The number is Armstrong");
		else
			System.out.println("The number is not Armstrong");
	}
	 
	public static boolean getArmstrong(int n ) {
		  int n1=n;
		  int sum=0;
		  int rem=0;
		 while(n1>0) {
			 rem = n1%10;
			 sum+=rem*rem*rem;
			 n1 = n1/10;
			 
			 if(sum==n) 
				  return true;		                                                                                                                                                                                                
		 }
		
	  return false;
	}
}
