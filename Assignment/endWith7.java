package Assignment;

import java.util.Scanner;

public class endWith7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		printNum(n);
	}
	 public static void printNum(int n) {
	    	int count=0;
	    	int i = 0;
	    	while(i<=n) {
	    		if(i%7==0 && i%10==7) {
	    			System.out.print(i+" ");
	    			count++;
	    		}
	    	i++;	
	    	}
	    	System.out.println("\nTotal such number are : "+count);
	 }
}
