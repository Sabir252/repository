package Lesson40H;

import java.util.function.Predicate;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> number = a -> a % 2 == 1;
		System.out.println(number.test(3));
	}

}
