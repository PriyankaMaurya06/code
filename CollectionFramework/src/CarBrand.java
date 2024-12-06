import java.util.Comparator;

public class CarBrand implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		
		return c1.brand.compareToIgnoreCase(c2.brand);
	}
      
} 
