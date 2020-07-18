package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {

		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Landcruiser", "white", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 20000),
				new Car("Mini", "Cooper", "Grey", 14500)
				);
		
		Function<Car, String> priceandcolor = (c) -> {
			return "Price = " + c.getPrice() + ", Color = " + c.getColor();
		};
		
		System.out.println(priceandcolor.apply(cars.get(6)));
		
//		printCarsPriceRange(cars, 10000, 25000);
//		printCarsColor(cars, "Blue");
		
//		printCars(cars, new CarCondition<Car>() {
//			@Override
//			public boolean test(Car c) {
//				return c.getPrice()>=18000 && c.getPrice() <= 22000;
//			}	
//		});
//		
//		printCars(cars, new CarCondition<Car>() {
//			@Override
//			public boolean test(Car c) {
//				return c.getColor() == "Blue";
//			}	
//		});
		
//		The same, but more beauytful
		printCars(cars, (c)-> c.getPrice()>=18000 && c.getPrice()<=22000);
		printCars(cars, (c)-> c.getColor() == "Blue");
		
		
	}
	
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c :cars) {
			if(predicate.test(c)) {
				c.printCar();
			}
		}
	}
	
//	@FunctionalInterface
//	interface Condition<T> {
//		public boolean test(T c);
//
//	}
	
	
	
	
//	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
//		for(Car c:cars) {
//			if(low<=c.getPrice() && c.getPrice() <=high) {
//				c.printCar();
//			}
//		}
//	}
//	
//	public static void printCarsColor(List<Car> cars, String color) {
//		for(Car c: cars) {
//			if(c.getColor()==color) {
//				c.printCar();
//			}
//		}
//	}
//
}
