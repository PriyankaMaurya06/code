package Assignment;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter number : ");
	       int n = sc.nextInt();
	       getPattern1(n);
	       System.out.print("\n\n\n");
	       getPattern2(n);
	       System.out.print("\n\n\n");
	       getPattern3(n);
	       System.out.print("\n\n\n");
	       getPattern4(n);
	       System.out.print("\n\n\n");
	       getPattern5(n);
	       System.out.print("\n\n\n");
	       getPattern6(n);
	}

	public static void getPattern1(int n) {
		for(int i=0 ; i<n;  i++) {
			  for(int j = 0 ; j<=i ; j++) {
			    System.out.print("*");
			}
			  System.out.print("\n");  
		}
	}
	
	
	public static void getPattern2(int n) {
		for(int i=1 ; i<=n;  i++) {
			  for(int j=i ; j<=n ; j++) {
			    System.out.print("*");
			}
			  System.out.print("\n");  
		}
	}
	
	public static void getPattern3(int n) {
		for(int i=1 ; i<=n;  i++) {
			  for(int j=i ; j<=n ; j++) {
			    System.out.print(" ");
			} 
		for(int k=1 ; k<=i;  k++) {
	              System.out.print("*");
				}
				  System.out.println();  
			}
		
	}
	
	public static void getPattern4(int n) {
		for(int i=1 ; i<=n;  i++) {
			  for(int j=i ; j<=n ; j++) {
			    System.out.print("  ");
			} 
		for(int k=1 ; k<i;  k++) {
	              System.out.print("* ");
				}
		for (int l=1 ; l<=i ; l++) {
			     System.out.print("* ");
		}
		System.out.println();  	    
			}
	}
	
	public static void getPattern5(int n) {
		for(int i=1 ; i<=n;  i++) {
			  for(int j=1 ; j<=i ; j++) {
			    System.out.print("  ");
			} 
		for(int k=i ; k<n;  k++) {
	              System.out.print("* ");
				}
		for (int l=i ; l<=n ; l++) {
			     System.out.print("* ");
		}
		System.out.println();  	    
			}
	}
	
	public static void getPattern6(int n) {
		for(int i=1 ; i<=n;  i++) {
				for(int k=1; k<=n;  k++) {
						if(i==1 || i==n) {
							System.out.print("* ");
						}
						else if(k==1 || k==n) {
							System.out.print("* ");
						}
						else {
				              System.out.print("  ");
							}
		}
		System.out.println();  	    
			}
	}
	

}
