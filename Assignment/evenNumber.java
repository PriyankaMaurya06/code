package Assignment;

import java.util.Scanner;

public class evenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		printEven(n);
	}
    
	public static void printEven(int n) {
		
			int i = 1;
			System.out.println("All even Numbers up to "+n+" are below :--");	
			while(i<=n) {
			
				if(i%2==0) {
					System.out.print(i+" ");
				}
			    	
				i++;
			}
	}	
}
