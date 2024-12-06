package biggestOf2;

import java.util.Scanner;

public class ProCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: "); 
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Weight: ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Address: ");
		String Address = sc.nextLine();
		System.out.println("Enter the Country: ");
		String country = sc.nextLine();
		System.out.println("Enter the Mobile Number: ");
		long mobno = sc.nextLong();
		
		
		System.out.println("\nEnter details are belowe========");
		System.out.println("Age is : " + age);
		System.out.println("Name is: "+ name);
		System.out.println("Weight is: "+weight+" KG");
		System.out.println("Address is: "+Address);
		System.out.println("Country is: "+country);
		System.out.println("Mobile Number is: "+mobno);
	}

}
