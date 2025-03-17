package Lesson37H;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<Car> cars = new ArrayList<>();
	
	Car car1 = new Car("BMW", 2020);
	Car car2 = new Car("Mercedes", 2014);
	Car car3 = new Car("Lexus", 2015);
	
	cars.add(car1);
	cars.add(car2);
	cars.add(car3);
	Collections.sort(cars);
	System.out.println(cars);

	
}
}
