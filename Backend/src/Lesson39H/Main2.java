package Lesson39H;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();
	numbers.add(10);
	numbers.add(3);
	numbers.add(5);
	numbers.add(8);
	numbers.add(12);
	numbers.add(7);
	System.out.println(numbers);
	
	List<Integer> doublednumbers = numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
	
	System.out.println(doublednumbers);
}
}
