package revision;

public class findbig {

	public static void main(String[] args) {
		int a = 170;
		int b = 60;
		int c = 100;
		if(a>b && a>c) {
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is greater");
		}
		else {
			System.out.println(c+" is greater");
		}

	}

}
