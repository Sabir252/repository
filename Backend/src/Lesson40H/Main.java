package Lesson40H;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> idk = a -> a.length() > 5;
		System.out.println(idk.test("Hello"));
		
		Function<String, Integer> lengthFunction = str -> str.length();
		System.out.println(lengthFunction.apply("Hello"));
		
		Function<String, String> otherFunction = str -> str.toUpperCase();
		String aString = otherFunction.apply("Hello");
		System.out.println(aString);
		
		Consumer<String> printer = str -> System.out.println(str);
		printer.accept("Hello");
		
		Consumer<Integer> printer2 = str -> System.out.println(str);
		printer2.accept(5);
		
		Supplier<Double> randomSupplier = () -> Math.random();
		System.out.println(randomSupplier.get());
 	}

}
