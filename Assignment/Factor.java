package Assignment;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		printNum(n);

	}
	public static void printNum(int n) {
    	int i = 1;
    	while(i<=n/2) {
    		if(n%i==0 ) {
    			System.out.print(i+" ");
    			    		}
    	i++;	
    	}
 
	}
}
