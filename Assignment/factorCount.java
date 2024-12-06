package Assignment;

import java.util.Scanner;

public class factorCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getFact(n);
		checkPrime(n);

	}
	public static void getFact(int n) {
		int count=0;
    	int i = 1;
    	while(i<=n/2) {
    		if(n%i==0 ) {
    			System.out.print(i+" ");
    			count++;
    		}
    	i++;	
    	}
    	System.out.println("\nTotal factors are : "+count);
	}
	public static void checkPrime(int n) {
		int count=0;
    	int i = 1;
    	while(i<=n/2) { 
    		if(n%i==0 ) 
    			count++;
    	i++;
    	}//loop
    if(count==1)
    	      System.out.println(n+" is a Prime number.");
    else
    	      System.out.println(n+" is not a prime number.");
    		
	}

}
