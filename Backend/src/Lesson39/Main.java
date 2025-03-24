package Lesson39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(2);
		numbers.add(6);
		numbers.add(5);
		System.out.println(numbers);
		
		List<Integer> doublednumbers = numbers.stream().filter(s -> s % 5 == 0).map(s-> s *2).collect(Collectors.toList());
		
		System.out.println(doublednumbers);
	}
}
