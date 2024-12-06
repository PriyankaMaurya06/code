import java.util.*;

public class CarDriver {

	public static void main(String[] args) {
		List<Car> l1=new ArrayList<>();
		
		System.out.println("=============Before Sorting=============");
		l1.add(new Car("Maruti",8546235,"Honda"));
		l1.add(new Car("Desire",9950235,"Tata"));
		l1.add(new Car("Bloro",6584325,"Suzuki"));
		l1.add(new Car("Scorpio",7658436,"Honda"));
		l1.add(new Car("Nisha",4589632,"Tata"));
		
		for(Car x:l1) {
		   System.out.println(x);
		}
		System.out.println("=============After Sorting=============");
        
		Collections.sort(l1, new CarPrice());
		for(Car x :l1) {
		   System.out.println(x);
		}
	}

}
