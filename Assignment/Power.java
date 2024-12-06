package Assignment;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the exponent number : ");
	    int n2 = sc.nextInt();
	    power(n1 , n2);
	}
   
    public static void power(int n1 , int n2) {
    	int i=1;
    	double p=1;
    	if(n2>=0) {
    
		    	while(i<=n2) {
				           p *=n1;
				           i++;
		    	  }
    	
    	}
    	else {
    		n2=-n2;  //to make negative exponent to positive.
    		while(i<=n2) {
    			
		           p *=1.0/n1;
		           i++;
    	     }
    	}		
           System.out.println(n1+ " raise to the power of " +n2+ " is :"+p);
    	}
} 
    

