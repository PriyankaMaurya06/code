package biggestOf2;

public class program1 {

	public static void main(String[] args) {
		int a= 99;
		int b = 45;
		int big=getBig(a,b);
		System.out.println(big);	

	}
	public static int getBig(int a, int b)
	{
		if(a>b)
		{
			
			System.out.println(a+" is bigger");
			return a;
		}
		else 
		{
			System.out.println(b+" is bigger");
			return b;
		}
		
	}
}
