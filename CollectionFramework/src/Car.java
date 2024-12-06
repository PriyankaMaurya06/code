
public class Car {
	 String name;
	 int price;
	 String brand;
	 
	 Car()
	 {
		 
	 } 

	public Car(String name, int price, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
	
}