package inheritanceProgram;

public class Car extends Vehicle{
	int a = 70;
	public void demo()
	{
		System.out.println("This is demo method");
		int a=80;
		System.out.println("Local a is : "+a);
		System.out.println("Car a of test is : "+this.a);
		System.out.println("Vehicle a is : "+super.a);
		
		super.test();
	}

}



