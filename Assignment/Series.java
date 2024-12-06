
package Assignment;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n for series : ");	
		int n = sc.nextInt();
		sumOfSeries1(n);
		sumOfSeries2(n);
		sumOfSeries3(n);
		sumOfSeries4(n);
		sumOfSeries5(n);
		sumOfSeries6(n);
		sumOfSeries7(n);
		sumOfSeries8(n);
		sumOfSeries9(n);
		sumOfSeries10(n);
	}
	
	

	public static void sumOfSeries1(int n) {
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum = sum+i;
				if(i==n) {
					System.out.print(i +" ");
				}
				else {
				System.out.print(i +"+");
				}
			i++;
		}
		
		System.out.println("\nThe sum of the series 1 is : "+sum);
		System.out.print("\n\n");
	}
	
	
	
	
	public static void sumOfSeries2(int n) {
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum=sum+i*i;
			
			      if(i==n) {
			    	  System.out.print(i +"²"+" ");
			      }
			      else {
					System.out.print(i +"²"+"+");
			      }
			i++;
			
		}
		System.out.println("\nSum of the series 2 is : "+sum);
		System.out.print("\n\n");
	}
	
	
	
	
	public static void sumOfSeries3(int n) {
		int sum=0;
		int i=1;
		while(i<=n) {
			sum = sum + i*i*i;
			
			         if(i==n) {
						System.out.print(i+"³"+" ");
			         }
			         else {
			        	 System.out.print(i+"³"+"+"); 
			         }
				i++;
		}
		System.out.print("\nThe sum of the Series is : "+sum);
		System.out.print("\n\n");
	}
	
	
	
	public static void sumOfSeries4(int n) {
		int sum=0;
		int i=1;
		while(i<=n) {
			sum = sum + i*i*i*i;
						if(i==n) {	
							System.out.print(i+"⁴"+" ");
						}
						else {
							System.out.print(i+"⁴"+"+");
						}
				i++;
		}
		System.out.print("\nThe sum of the Series is : "+sum);
		System.out.print("\n\n");
   }
	
	
	
	public static void sumOfSeries5(int n) {
		int sum =0;
		int i = 1;
		int a = 1;
		while(i<=n-1) {      
			 sum= sum+i*(i+1);
			 a =i+1;
			          if(i==n-1) {
						 System.out.print(i+"*"+a+" ");
			          }
			          else {
			        	  System.out.print(i+"*"+a+"+");
			          }
				i++;
		}
		System.out.print("\nThe sum of the series is : "+sum);
		System.out.println("\n\n");
	}
	
	
	
	public static void sumOfSeries6(int n) {
		int sum =0;
		int i = 1;
		int a = 1;
		while(i<=n-1) {
			 sum= sum+i*((i+1)*(i+1));
			 a =i+1;
			 			if(i==n-1) {
							 System.out.print(i+"*"+a+"²"+" ");
			 			}
			 			else {
			 				System.out.print(i+"*"+a+"²"+"+");
			 			}
			   i++;
		}
		System.out.print("\nThe sum of the series is : "+sum);
		System.out.println("\n\n");
	}
	
	
	
	public static void sumOfSeries7(int n) {
		int sum =0;
		int i = 1;
		int a = 1;
		while(i<=n-1) {
			 sum= sum+(i*i)*(i+1);
			 a =i+1;
			 			if(i==n-1) {
							 System.out.print(i+"²"+"*"+a+" ");
			 			}
			 			else {
			 				System.out.print(i+"²"+"*"+a+"+");
			 			}			 
			    i++;
		}
		System.out.print("\nThe sum of the series is : "+sum);
		System.out.println("\n\n");
	}
	
	
	
	public static void sumOfSeries8(int n) {
		double sum =0;
		int i = 1;
		while(i<=n) {
			 sum=sum+1.0/i;
			 		  if(i==n) {
						 System.out.print("1"+"/"+i+" ");
			 		  }
			 		  else {
			 			 System.out.print("1"+"/"+i+"+");
			 		  }
			    i++;
		}
		System.out.print("\nThe sum of the series is : "+sum);
		System.out.println("\n\n");
  }
	
	
	
	
	public static void sumOfSeries9(int n) {
		double sum =0;
		int i = 1;
		while(i<=n) {
			 sum=sum+1.0/(i*i);
			 			if(i==n) {
							 System.out.print("1"+"/"+i+"²"+" ");
			 			}
			 			else {
			 				System.out.print("1"+"/"+i+"²"+"+");
			 			}
				i++;
		}
		System.out.print("\nThe sum of the series is : "+sum);
		System.out.println("\n\n");
	}
	
	
	
	
	public static void sumOfSeries10(int n) {
		double sum =0;
		int i = 1;
		while(i<=n) {
			 sum=sum+1.0/(i*(i+1));
			 int a=i+1;
			 			if(i==n) {
							 System.out.print("1"+"/"+i+"*"+a+" ");
			 			}
			 			else {
			 				System.out.print("1"+"/"+i+"*"+a+"+");
			 			}
			     i++;
		}
		System.out.print("\nThe sum of the series is : "+sum);
		System.out.println("\n\n");
	}
} 
	
