package biggestOf2;

public class program2 {

	public static void main(String[] args) {
		int a=13;
	    
		System.out.println("Table\n");
		System.out.println("-------------------");
		table(a);

	}

	public static void table(int a) {
		for(int i=1; i<=10; i++) {
		
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}
}
