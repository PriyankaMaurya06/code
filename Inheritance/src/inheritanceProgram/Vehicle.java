package inheritanceProgram;

public class Vehicle {
   int a=30;
   
   public void test()
   {
	   System.out.println("This is test method");
	   int a=40;
	   System.out.println("Local a of test is : "+a);
	   System.out.println("Vehicle a is : "+this.a);
   }
}
